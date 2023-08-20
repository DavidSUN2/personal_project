
package MutableByte;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableByte0 {

    public static boolean debug = false;

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test001");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.Class<?> wildcardClass5 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test002");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.Class<?> wildcardClass2 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test003");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        java.lang.Byte byte8 = mutableByte1.getValue();
        long long9 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test004");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableByte1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test005");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.String str7 = mutableByte1.toString();
        mutableByte1.add((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test006");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        short short7 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test007");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        mutableByte1.decrement();
        short short9 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -2 + "'", short9 == (short) -2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test008");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        double double7 = mutableByte1.doubleValue();
        mutableByte1.add((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test009");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        boolean boolean8 = mutableByte1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.lang3.mutable.MutableByte mutableByte9 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test011");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        long long8 = mutableByte1.longValue();
        float float9 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.0f + "'", float9 == 9.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test012");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        long long8 = mutableByte1.longValue();
        java.lang.String str9 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "9" + "'", str9.equals("9"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test013");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test014");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        java.lang.Byte byte7 = mutableByte1.toByte();
        long long8 = mutableByte1.longValue();
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9.equals((byte) 100));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test015");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.String str7 = mutableByte1.toString();
        int int8 = mutableByte1.intValue();
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test016");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        mutableByte1.setValue((java.lang.Number) 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test017");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte();
        float float8 = mutableByte7.floatValue();
        mutableByte6.setValue((java.lang.Number) mutableByte7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test018");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        mutableByte1.add((byte) 1);
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test019");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test020");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        mutableByte1.subtract((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test021");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        long long8 = mutableByte1.longValue();
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test022");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        byte byte8 = mutableByte1.byteValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test023");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        boolean boolean8 = mutableByte1.equals((java.lang.Object) (byte) 0);
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test024");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((byte) -1);
        boolean boolean9 = mutableByte1.equals((java.lang.Object) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test025");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test026");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((java.lang.Number) (byte) 1);
        mutableByte1.increment();
        java.lang.String str9 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test027");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        byte byte8 = mutableByte1.byteValue();
        long long9 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test028");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test029");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        boolean boolean8 = mutableByte1.equals((java.lang.Object) (byte) 0);
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test030");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        boolean boolean8 = mutableByte1.equals((java.lang.Object) (byte) 0);
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test031");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        long long7 = mutableByte1.longValue();
        java.lang.Class<?> wildcardClass8 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test032");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        java.lang.Byte byte8 = mutableByte1.getValue();
        double double9 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test033");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        mutableByte1.decrement();
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test034");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte();
        float float3 = mutableByte2.floatValue();
        mutableByte2.add((byte) 0);
        java.lang.String str6 = mutableByte2.toString();
        float float7 = mutableByte2.floatValue();
        mutableByte1.setValue((java.lang.Number) float7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test035");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        byte byte8 = mutableByte1.byteValue();
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9.equals((byte) -1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test036");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte3.increment();
        long long5 = mutableByte3.longValue();
        int int6 = mutableByte1.compareTo(mutableByte3);
        long long7 = mutableByte1.longValue();
        java.lang.Byte byte8 = mutableByte1.getValue();
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test037");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test038");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.String str7 = mutableByte6.toString();
        mutableByte6.add((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test039");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str7 = mutableByte6.toString();
        byte byte8 = mutableByte6.byteValue();
        boolean boolean9 = mutableByte1.equals((java.lang.Object) byte8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test040");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte3.increment();
        long long5 = mutableByte3.longValue();
        int int6 = mutableByte1.compareTo(mutableByte3);
        long long7 = mutableByte1.longValue();
        mutableByte1.setValue((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test041");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.String str7 = mutableByte1.toString();
        mutableByte1.decrement();
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9 == (byte) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test042");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        mutableByte0.add((java.lang.Number) 10.0d);
        java.lang.Byte byte8 = mutableByte0.toByte();
        java.lang.Byte byte9 = mutableByte0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test043");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        long long5 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9L + "'", long5 == 9L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test044");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableByte1.subtract(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test045");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        long long2 = mutableByte1.longValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte4.subtract((java.lang.Number) (byte) 10);
        mutableByte1.setValue((java.lang.Number) mutableByte4);
        int int9 = mutableByte4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test046");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.String str7 = mutableByte1.toString();
        mutableByte1.decrement();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test047");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.Byte byte7 = mutableByte1.getValue();
        mutableByte1.add((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test048");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.String str7 = mutableByte1.toString();
        mutableByte1.decrement();
        java.lang.String str9 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "9" + "'", str9.equals("9"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test049");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        java.lang.String str7 = mutableByte1.toString();
        mutableByte1.setValue((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test050");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((java.lang.Number) (byte) 1);
        java.lang.Byte byte8 = mutableByte1.getValue();
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test051");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test052");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        java.lang.Byte byte8 = mutableByte1.getValue();
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test053");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.setValue((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test054");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        mutableByte1.add((byte) 1);
        java.lang.String str9 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "11" + "'", str9.equals("11"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test055");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -91 + "'", short4 == (short) -91);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test056");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        double double7 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test057");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        long long7 = mutableByte1.longValue();
        java.lang.Byte byte8 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 20 + "'", byte8.equals((byte) 20));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test058");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        mutableByte0.decrement();
        long long8 = mutableByte0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test059");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        byte byte6 = mutableByte1.byteValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6 == (byte) 20);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test060");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        mutableByte1.decrement();
        mutableByte1.subtract((byte) 10);
        long long9 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-10L) + "'", long9 == (-10L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test061");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        float float7 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test062");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.String str7 = mutableByte1.toString();
        int int8 = mutableByte1.intValue();
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test063");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        short short7 = mutableByte0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test064");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.String str7 = mutableByte1.toString();
        mutableByte1.decrement();
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test065");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        java.lang.Byte byte6 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 2 + "'", byte6.equals((byte) 2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test066");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        long long8 = mutableByte1.longValue();
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test067");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test068");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        float float2 = mutableByte1.floatValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test069");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        java.lang.Byte byte8 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test070");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableByte6.add(number7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test071");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.Byte byte7 = mutableByte1.getValue();
        mutableByte1.setValue((java.lang.Number) 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test072");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        byte byte4 = mutableByte0.byteValue();
        mutableByte0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test073");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test074");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        java.lang.Class<?> wildcardClass2 = mutableByte0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test075");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.Byte byte6 = mutableByte1.toByte();
        mutableByte1.add((java.lang.Number) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test076");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        mutableByte1.add((byte) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test077");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        java.lang.Byte byte7 = mutableByte1.toByte();
        mutableByte1.setValue((byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test078");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double6 = mutableByte5.doubleValue();
        mutableByte1.add((java.lang.Number) double6);
        mutableByte1.add((byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test079");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test080");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        mutableByte1.add((byte) 1);
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9 == (byte) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test081");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        long long2 = mutableByte1.longValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte4.subtract((java.lang.Number) (byte) 10);
        mutableByte1.setValue((java.lang.Number) mutableByte4);
        byte byte9 = mutableByte4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test082");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 11 + "'", short2 == (short) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test083");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        java.lang.Byte byte4 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4.equals((byte) 0));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test084");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        float float8 = mutableByte1.floatValue();
        short short9 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-2.0f) + "'", float8 == (-2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -2 + "'", short9 == (short) -2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test085");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        mutableByte1.add((byte) 20);
        java.lang.Class<?> wildcardClass4 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test086");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        mutableByte0.increment();
        short short5 = mutableByte0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test087");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.Byte byte7 = mutableByte1.getValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test088");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        mutableByte1.add((byte) 1);
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9.equals((byte) 11));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test089");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test090");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        java.lang.String str6 = mutableByte1.toString();
        int int7 = mutableByte1.intValue();
        java.lang.Byte byte8 = mutableByte1.toByte();
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2" + "'", str6.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 2 + "'", byte8.equals((byte) 2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 2 + "'", byte9.equals((byte) 2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test091");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        int int8 = mutableByte1.intValue();
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test092");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableByte1.setValue(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test093");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        short short8 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -2 + "'", short8 == (short) -2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test094");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        java.lang.Byte byte7 = mutableByte1.toByte();
        long long8 = mutableByte1.longValue();
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test095");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.setValue((java.lang.Number) (byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte9 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test096");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test097");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 20);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        mutableByte6.subtract((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test098");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.subtract((java.lang.Number) (byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test099");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        mutableByte0.decrement();
        mutableByte0.setValue((byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test100");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        java.lang.String str5 = mutableByte1.toString();
        java.lang.Class<?> wildcardClass6 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "9" + "'", str5.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test101");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.setValue((byte) 9);
        mutableByte1.setValue((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test102");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        java.lang.Class<?> wildcardClass4 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test103");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        java.lang.Byte byte7 = mutableByte1.toByte();
        long long8 = mutableByte1.longValue();
        float float9 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test104");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("100");
        int int2 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test105");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        java.lang.Byte byte7 = mutableByte1.toByte();
        mutableByte1.setValue((java.lang.Number) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test106");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((java.lang.Number) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test107");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.increment();
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9 == (byte) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test108");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((byte) -1);
        mutableByte1.setValue((java.lang.Number) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test109");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((byte) -1);
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test110");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte3.increment();
        long long5 = mutableByte3.longValue();
        int int6 = mutableByte1.compareTo(mutableByte3);
        mutableByte3.add((byte) 0);
        java.lang.Class<?> wildcardClass9 = mutableByte3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test111");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.getValue();
        java.lang.Byte byte7 = mutableByte1.toByte();
        mutableByte1.increment();
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 20 + "'", byte7.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test112");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        double double7 = mutableByte1.doubleValue();
        java.lang.Byte byte8 = mutableByte1.getValue();
        float float9 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test113");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        java.lang.Byte byte8 = mutableByte1.toByte();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8.equals((byte) -2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test114");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        double double6 = mutableByte0.doubleValue();
        mutableByte0.subtract((byte) 99);
        java.lang.Class<?> wildcardClass9 = mutableByte0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test115");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        java.lang.String str6 = mutableByte1.toString();
        int int7 = mutableByte1.intValue();
        java.lang.Byte byte8 = mutableByte1.toByte();
        java.lang.String str9 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2" + "'", str6.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 2 + "'", byte8.equals((byte) 2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "2" + "'", str9.equals("2"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test116");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        java.lang.Byte byte7 = mutableByte1.toByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte8.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7.equals((byte) 100));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test117");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        double double7 = mutableByte1.doubleValue();
        java.lang.Byte byte8 = mutableByte1.toByte();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test118");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 20);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        mutableByte6.setValue((java.lang.Number) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test119");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte3.increment();
        long long5 = mutableByte3.longValue();
        int int6 = mutableByte1.compareTo(mutableByte3);
        long long7 = mutableByte1.longValue();
        double double8 = mutableByte1.doubleValue();
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test120");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        mutableByte0.subtract((byte) 20);
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        int int9 = mutableByte0.compareTo(mutableByte8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test121");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        mutableByte1.setValue((byte) 0);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test122");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        double double4 = mutableByte1.doubleValue();
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test123");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        java.lang.Class<?> wildcardClass8 = mutableByte6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test124");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.Byte byte6 = mutableByte1.toByte();
        float float7 = mutableByte1.floatValue();
        mutableByte1.subtract((byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test125");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        int int2 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test126");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        mutableByte0.decrement();
        mutableByte0.add((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test127");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        java.lang.Class<?> wildcardClass4 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test128");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        float float4 = mutableByte1.floatValue();
        double double5 = mutableByte1.doubleValue();
        mutableByte1.subtract((java.lang.Number) (byte) 9);
        byte byte8 = mutableByte1.byteValue();
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 2 + "'", byte8 == (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 2 + "'", byte9.equals((byte) 2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test129");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        double double6 = mutableByte1.doubleValue();
        float float7 = mutableByte1.floatValue();
        java.lang.String str8 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 20.0f + "'", float7 == 20.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test130");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        long long2 = mutableByte0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test131");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((byte) -1);
        byte byte8 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 11 + "'", byte8 == (byte) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test132");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte7 = mutableByte1.getValue();
        java.lang.String str8 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test133");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        double double2 = mutableByte1.doubleValue();
        int int3 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test134");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.add((byte) 0);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test135");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        java.lang.Byte byte4 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 11 + "'", byte4.equals((byte) 11));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test136");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test137");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((byte) -91);
        mutableByte1.add((java.lang.Number) mutableByte6);
        float float8 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-90.0f) + "'", float8 == (-90.0f));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test138");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        int int8 = mutableByte1.compareTo(mutableByte7);
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test139");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test140");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test141");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        float float4 = mutableByte3.floatValue();
        int int5 = mutableByte1.compareTo(mutableByte3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test142");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 20);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test143");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        long long3 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test144");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Class<?> wildcardClass2 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test145");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((java.lang.Number) (byte) 1);
        mutableByte1.decrement();
        java.lang.String str9 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "8" + "'", str9.equals("8"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test146");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        mutableByte1.decrement();
        long long8 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 19L + "'", long8 == 19L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test147");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        mutableByte1.subtract((byte) 9);
        mutableByte1.subtract((java.lang.Number) (short) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test148");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.subtract((byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test149");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        mutableByte1.add((byte) 1);
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test150");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        mutableByte0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test151");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 0);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.String str3 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test152");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double6 = mutableByte5.doubleValue();
        mutableByte1.setValue((java.lang.Number) double6);
        java.lang.Byte byte8 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 11 + "'", byte8.equals((byte) 11));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test153");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte6.subtract((byte) 0);
        java.lang.Byte byte9 = mutableByte6.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test154");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        mutableByte1.add((byte) 0);
        mutableByte1.subtract((byte) 9);
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test155");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        mutableByte1.decrement();
        mutableByte1.subtract((byte) 10);
        float float9 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-10.0f) + "'", float9 == (-10.0f));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test156");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        mutableByte6.subtract((byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test157");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.decrement();
        byte byte3 = mutableByte1.byteValue();
        java.lang.Byte byte4 = mutableByte1.getValue();
        mutableByte1.add((byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 99 + "'", byte3 == (byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 99 + "'", byte4.equals((byte) 99));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test158");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        boolean boolean4 = mutableByte1.equals((java.lang.Object) (-1L));
        java.lang.Byte byte5 = mutableByte1.getValue();
        java.lang.String str6 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test159");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        int int5 = mutableByte1.intValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 11 + "'", byte4 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test160");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        double double4 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) double4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test161");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test162");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.decrement();
        byte byte3 = mutableByte1.byteValue();
        java.lang.Class<?> wildcardClass4 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 99 + "'", byte3 == (byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test163");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.add((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Class<?> wildcardClass6 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test164");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.String str7 = mutableByte6.toString();
        mutableByte6.increment();
        long long9 = mutableByte6.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test165");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test166");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        boolean boolean7 = mutableByte1.equals((java.lang.Object) 10.0d);
        mutableByte1.subtract((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test167");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        long long7 = mutableByte1.longValue();
        float float8 = mutableByte1.floatValue();
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 20.0f + "'", float8 == 20.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test168");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.String str7 = mutableByte1.toString();
        double double8 = mutableByte1.doubleValue();
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test169");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 0.0d);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 9 + "'", short4 == (short) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test170");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        double double2 = mutableByte1.doubleValue();
        java.lang.Byte byte3 = mutableByte1.getValue();
        mutableByte1.setValue((byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test171");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double6 = mutableByte5.doubleValue();
        mutableByte1.setValue((java.lang.Number) double6);
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        byte byte9 = mutableByte8.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9 == (byte) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test172");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        int int8 = mutableByte1.intValue();
        float float9 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.0f + "'", float9 == 9.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test173");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        double double7 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test174");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        java.lang.Byte byte2 = mutableByte1.getValue();
        mutableByte1.decrement();
        mutableByte1.setValue((byte) -8);
        java.lang.Class<?> wildcardClass6 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2.equals((byte) 2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test175");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        mutableByte1.setValue((byte) 0);
        int int4 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test176");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        java.lang.Byte byte4 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4.equals((byte) -1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test177");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte4 = mutableByte3.toByte();
        java.lang.Byte byte5 = mutableByte3.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test178");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        java.lang.Byte byte7 = mutableByte1.toByte();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7.equals((byte) 100));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test179");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        int int3 = mutableByte1.intValue();
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test180");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((byte) -1);
        float float8 = mutableByte1.floatValue();
        long long9 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 11.0f + "'", float8 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test181");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        double double6 = mutableByte0.doubleValue();
        mutableByte0.setValue((byte) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test182");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        mutableByte1.setValue((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test183");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte();
        float float3 = mutableByte2.floatValue();
        mutableByte2.add((byte) 0);
        java.lang.String str6 = mutableByte2.toString();
        mutableByte2.setValue((byte) -1);
        mutableByte1.add((java.lang.Number) mutableByte2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test184");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        double double7 = mutableByte1.doubleValue();
        java.lang.Byte byte8 = mutableByte1.toByte();
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test185");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((java.lang.Number) (byte) 1);
        java.lang.Byte byte8 = mutableByte1.getValue();
        float float9 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 9.0f + "'", float9 == 9.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test186");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        int int6 = mutableByte1.intValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test187");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.setValue((byte) 100);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test188");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        int int8 = mutableByte1.compareTo(mutableByte7);
        short short9 = mutableByte7.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test189");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        double double4 = mutableByte1.doubleValue();
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test190");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.getValue();
        java.lang.Class<?> wildcardClass7 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test191");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        java.lang.String str6 = mutableByte1.toString();
        int int7 = mutableByte1.intValue();
        byte byte8 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2" + "'", str6.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 2 + "'", byte8 == (byte) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test192");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        java.lang.String str7 = mutableByte0.toString();
        double double8 = mutableByte0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test193");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        java.lang.Class<?> wildcardClass2 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test194");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (-1.0f));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test195");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        byte byte5 = mutableByte1.byteValue();
        double double6 = mutableByte1.doubleValue();
        mutableByte1.increment();
        mutableByte1.add((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test196");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.setValue((byte) -91);
        byte byte6 = mutableByte0.byteValue();
        java.lang.String str7 = mutableByte0.toString();
        java.lang.Class<?> wildcardClass8 = mutableByte0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -91 + "'", byte6 == (byte) -91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-91" + "'", str7.equals("-91"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test197");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.Byte byte6 = mutableByte1.toByte();
        java.lang.String str7 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test198");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        byte byte6 = mutableByte0.byteValue();
        float float7 = mutableByte0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test199");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        int int6 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test200");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        java.lang.Byte byte6 = mutableByte1.toByte();
        mutableByte1.add((byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte9 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test201");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        mutableByte1.decrement();
        mutableByte1.subtract((byte) -2);
        byte byte8 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4.equals((byte) -91));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -90 + "'", byte8 == (byte) -90);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test202");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        long long2 = mutableByte1.longValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test203");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        mutableByte3.subtract((java.lang.Number) (-1.0f));
        mutableByte1.add((java.lang.Number) (-1.0f));
        java.lang.Byte byte7 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 99 + "'", byte7.equals((byte) 99));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test204");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double6 = mutableByte5.doubleValue();
        mutableByte1.setValue((java.lang.Number) double6);
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte9 = mutableByte8.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9.equals((byte) 11));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test205");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte5 = mutableByte4.getValue();
        double double6 = mutableByte4.doubleValue();
        mutableByte4.increment();
        int int8 = mutableByte1.compareTo(mutableByte4);
        java.lang.String str9 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "11" + "'", str9.equals("11"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test206");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        long long7 = mutableByte1.longValue();
        double double8 = mutableByte1.doubleValue();
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 20 + "'", byte9.equals((byte) 20));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test207");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test208");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        mutableByte1.increment();
        long long7 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test209");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        byte byte6 = mutableByte0.byteValue();
        mutableByte0.add((byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test210");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        mutableByte1.decrement();
        mutableByte1.subtract((byte) 0);
        mutableByte1.decrement();
        short short8 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 8 + "'", short8 == (short) 8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test211");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        java.lang.String str7 = mutableByte0.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test212");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("12");
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double4 = mutableByte3.doubleValue();
        mutableByte3.decrement();
        boolean boolean6 = mutableByte1.equals((java.lang.Object) mutableByte3);
        mutableByte3.subtract((byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test213");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        java.lang.Class<?> wildcardClass4 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test214");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        int int2 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test215");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 9 + "'", short5 == (short) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test216");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte6.decrement();
        mutableByte6.add((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test217");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        int int8 = mutableByte7.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test218");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        mutableByte1.add((byte) 0);
        java.lang.Byte byte7 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 9 + "'", byte7.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test219");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte5.increment();
        long long7 = mutableByte5.longValue();
        mutableByte1.setValue((java.lang.Number) long7);
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test220");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        byte byte5 = mutableByte1.byteValue();
        mutableByte1.setValue((byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test221");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test222");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        byte byte3 = mutableByte1.byteValue();
        byte byte4 = mutableByte1.byteValue();
        double double5 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test223");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.setValue((byte) 0);
        java.lang.Byte byte6 = mutableByte0.getValue();
        mutableByte0.decrement();
        mutableByte0.add((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6.equals((byte) 0));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test224");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte9 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test225");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        int int5 = mutableByte1.intValue();
        short short6 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 9 + "'", short6 == (short) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test226");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        java.lang.Byte byte8 = mutableByte1.toByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte9 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) byte8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8.equals((byte) -2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test227");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        java.lang.String str6 = mutableByte1.toString();
        int int7 = mutableByte1.intValue();
        mutableByte1.setValue((byte) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2" + "'", str6.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test228");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        byte byte6 = mutableByte1.byteValue();
        mutableByte1.setValue((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test229");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -90);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test230");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        mutableByte1.decrement();
        float float7 = mutableByte1.floatValue();
        mutableByte1.subtract((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test231");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double6 = mutableByte5.doubleValue();
        mutableByte1.setValue((java.lang.Number) double6);
        boolean boolean9 = mutableByte1.equals((java.lang.Object) 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test232");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        mutableByte0.subtract((byte) -2);
        mutableByte0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test233");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.add((byte) 0);
        java.lang.Byte byte7 = mutableByte1.toByte();
        long long8 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test234");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        boolean boolean4 = mutableByte1.equals((java.lang.Object) (-1L));
        java.lang.Byte byte5 = mutableByte1.getValue();
        float float6 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test235");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test236");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte6);
        mutableByte7.subtract((byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test237");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        java.lang.Byte byte6 = mutableByte1.getValue();
        float float7 = mutableByte1.floatValue();
        java.lang.Byte byte8 = mutableByte1.getValue();
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test238");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("12");
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double4 = mutableByte3.doubleValue();
        mutableByte3.decrement();
        boolean boolean6 = mutableByte1.equals((java.lang.Object) mutableByte3);
        short short7 = mutableByte3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test239");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        double double4 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.0d + "'", double4 == 12.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test240");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.add((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test241");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        int int7 = mutableByte1.intValue();
        short short8 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test242");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        long long4 = mutableByte1.longValue();
        long long5 = mutableByte1.longValue();
        java.lang.String str6 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "11" + "'", str6.equals("11"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test243");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        int int7 = mutableByte1.intValue();
        mutableByte1.subtract((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test244");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 21);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test245");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("12");
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double4 = mutableByte3.doubleValue();
        mutableByte3.decrement();
        boolean boolean6 = mutableByte1.equals((java.lang.Object) mutableByte3);
        java.lang.Class<?> wildcardClass7 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test246");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 99);
        java.lang.Byte byte5 = mutableByte4.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 99 + "'", byte5.equals((byte) 99));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test247");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        float float4 = mutableByte1.floatValue();
        double double5 = mutableByte1.doubleValue();
        mutableByte1.subtract((java.lang.Number) (byte) 9);
        short short8 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 2 + "'", short8 == (short) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test248");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        double double7 = mutableByte1.doubleValue();
        java.lang.Byte byte8 = mutableByte1.getValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test249");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        mutableByte1.setValue((byte) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test250");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 20);
        mutableByte1.setValue((byte) -2);
        mutableByte1.setValue((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test251");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        int int7 = mutableByte1.intValue();
        java.lang.Class<?> wildcardClass8 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test252");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte4.setValue((byte) 1);
        int int7 = mutableByte4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test253");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("12");
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double4 = mutableByte3.doubleValue();
        mutableByte3.decrement();
        boolean boolean6 = mutableByte1.equals((java.lang.Object) mutableByte3);
        long long7 = mutableByte3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test254");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.decrement();
        java.lang.String str7 = mutableByte1.toString();
        java.lang.Class<?> wildcardClass8 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9" + "'", str7.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test255");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        java.lang.String str5 = mutableByte1.toString();
        float float6 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "9" + "'", str5.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 9.0f + "'", float6 == 9.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test256");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.subtract((byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test257");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        byte byte8 = mutableByte1.byteValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test258");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        boolean boolean8 = mutableByte1.equals((java.lang.Object) true);
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test259");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        byte byte6 = mutableByte1.byteValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6 == (byte) 20);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test260");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        double double7 = mutableByte1.doubleValue();
        byte byte8 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test261");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        double double3 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("2");
        java.lang.Class<?> wildcardClass6 = mutableByte5.getClass();
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte5);
        java.lang.Byte byte8 = mutableByte5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 2 + "'", byte8.equals((byte) 2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test262");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        java.lang.String str4 = mutableByte0.toString();
        java.lang.Byte byte5 = mutableByte0.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5.equals((byte) 100));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test263");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        byte byte6 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6 == (byte) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test264");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.setValue((byte) 9);
        java.lang.Class<?> wildcardClass6 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test265");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        byte byte6 = mutableByte0.byteValue();
        mutableByte0.decrement();
        mutableByte0.add((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test266");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        byte byte4 = mutableByte0.byteValue();
        java.lang.String str5 = mutableByte0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test267");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        long long4 = mutableByte1.longValue();
        long long5 = mutableByte1.longValue();
        mutableByte1.decrement();
        byte byte7 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test268");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.getValue();
        int int4 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test269");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 2 + "'", short2 == (short) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test270");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 20);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        long long8 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-19L) + "'", long8 == (-19L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test271");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 9);
        mutableByte1.subtract((byte) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test272");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        mutableByte1.subtract((byte) 0);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 2 + "'", short4 == (short) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test273");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        mutableByte0.setValue((byte) -91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test274");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        int int7 = mutableByte1.intValue();
        float float8 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test275");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte7 = mutableByte1.getValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test276");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        int int5 = mutableByte4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test277");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        java.lang.Byte byte3 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 9 + "'", byte3.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test278");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.decrement();
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test279");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        mutableByte1.subtract((byte) 9);
        java.lang.Class<?> wildcardClass8 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test280");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        byte byte6 = mutableByte0.byteValue();
        mutableByte0.decrement();
        java.lang.Byte byte8 = mutableByte0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8.equals((byte) -1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test281");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        mutableByte1.subtract((byte) 20);
        java.lang.String str7 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4.equals((byte) -91));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-111" + "'", str7.equals("-111"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test282");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double2 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        double double4 = mutableByte3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 11.0d + "'", double4 == 11.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test283");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        mutableByte1.decrement();
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 8 + "'", byte9.equals((byte) 8));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test284");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("20");
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test285");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        int int6 = mutableByte5.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test286");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte6.decrement();
        java.lang.Byte byte8 = mutableByte6.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test287");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.setValue((byte) 0);
        java.lang.Byte byte6 = mutableByte0.getValue();
        mutableByte0.decrement();
        short short8 = mutableByte0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test288");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        mutableByte1.decrement();
        float float6 = mutableByte1.floatValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4.equals((byte) -91));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-92.0f) + "'", float6 == (-92.0f));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test289");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        java.lang.String str7 = mutableByte0.toString();
        byte byte8 = mutableByte0.byteValue();
        java.lang.Byte byte9 = mutableByte0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9.equals((byte) 0));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test290");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte3.increment();
        java.lang.String str5 = mutableByte3.toString();
        byte byte6 = mutableByte3.byteValue();
        java.lang.Byte byte7 = mutableByte3.getValue();
        int int8 = mutableByte3.intValue();
        boolean boolean9 = mutableByte1.equals((java.lang.Object) int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "11" + "'", str5.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7.equals((byte) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test291");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.decrement();
        java.lang.Byte byte5 = mutableByte1.getValue();
        short short6 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test292");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -1);
        mutableByte1.decrement();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test293");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test294");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        java.lang.Byte byte6 = mutableByte1.toByte();
        float float7 = mutableByte1.floatValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test295");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        long long7 = mutableByte1.longValue();
        double double8 = mutableByte1.doubleValue();
        float float9 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 20.0f + "'", float9 == 20.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test296");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        double double2 = mutableByte1.doubleValue();
        float float3 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test297");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str6 = mutableByte5.toString();
        mutableByte1.setValue((java.lang.Number) mutableByte5);
        short short8 = mutableByte5.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test298");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        java.lang.String str4 = mutableByte1.toString();
        mutableByte1.setValue((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12" + "'", str4.equals("12"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test299");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        java.lang.Byte byte6 = mutableByte1.getValue();
        float float7 = mutableByte1.floatValue();
        java.lang.Byte byte8 = mutableByte1.getValue();
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test300");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        float float4 = mutableByte1.floatValue();
        double double5 = mutableByte1.doubleValue();
        float float6 = mutableByte1.floatValue();
        java.lang.Class<?> wildcardClass7 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 11.0f + "'", float6 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test301");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100L);
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test302");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        int int8 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test303");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.add((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test304");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.add((java.lang.Number) 2L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test305");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        int int7 = mutableByte0.intValue();
        mutableByte0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test306");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        java.lang.Byte byte7 = mutableByte1.toByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        float float9 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test307");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 0);
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 1.0f);
        float float4 = mutableByte1.floatValue();
        java.lang.String str5 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test308");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.increment();
        mutableByte1.setValue((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test309");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test310");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        float float4 = mutableByte1.floatValue();
        float float5 = mutableByte1.floatValue();
        mutableByte1.add((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 11.0f + "'", float5 == 11.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test311");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte6);
        byte byte8 = mutableByte6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 2 + "'", byte8 == (byte) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test312");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.setValue((byte) -91);
        byte byte6 = mutableByte0.byteValue();
        java.lang.String str7 = mutableByte0.toString();
        short short8 = mutableByte0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -91 + "'", byte6 == (byte) -91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-91" + "'", str7.equals("-91"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -91 + "'", short8 == (short) -91);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test313");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.String str6 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "9" + "'", str6.equals("9"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test314");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.getValue();
        boolean boolean8 = mutableByte1.equals((java.lang.Object) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test315");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        java.lang.Byte byte2 = mutableByte1.getValue();
        mutableByte1.decrement();
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableByte1.add(number4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2.equals((byte) 2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test316");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.Byte byte6 = mutableByte1.toByte();
        float float7 = mutableByte1.floatValue();
        java.lang.String str8 = mutableByte1.toString();
        double double9 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test317");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.decrement();
        byte byte3 = mutableByte1.byteValue();
        java.lang.Byte byte4 = mutableByte1.getValue();
        byte byte5 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 99 + "'", byte3 == (byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 99 + "'", byte4.equals((byte) 99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 99 + "'", byte5 == (byte) 99);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test318");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        mutableByte1.setValue((byte) 0);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test319");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        byte byte4 = mutableByte0.byteValue();
        byte byte5 = mutableByte0.byteValue();
        int int6 = mutableByte0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test320");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.subtract((byte) 0);
        int int4 = mutableByte1.intValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test321");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.subtract((java.lang.Number) (byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        double double6 = mutableByte1.doubleValue();
        java.lang.String str7 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test322");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        mutableByte0.subtract((byte) -2);
        short short9 = mutableByte0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 2 + "'", short9 == (short) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test323");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        mutableByte0.decrement();
        int int8 = mutableByte0.intValue();
        long long9 = mutableByte0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test324");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        long long6 = mutableByte1.longValue();
        mutableByte1.subtract((byte) 1);
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test325");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        java.lang.Byte byte6 = mutableByte1.getValue();
        java.lang.Byte byte7 = mutableByte1.toByte();
        boolean boolean9 = mutableByte1.equals((java.lang.Object) "-111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 9 + "'", byte7.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test326");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        java.lang.Byte byte2 = mutableByte1.getValue();
        int int3 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test327");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test328");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        java.lang.Byte byte7 = mutableByte1.toByte();
        long long8 = mutableByte1.longValue();
        java.lang.String str9 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "100" + "'", str9.equals("100"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test329");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.add((byte) 0);
        mutableByte1.setValue((byte) -2);
        java.lang.String str8 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-2" + "'", str8.equals("-2"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test330");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        java.lang.String str8 = mutableByte1.toString();
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "9" + "'", str8.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9 == (byte) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test331");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Class<?> wildcardClass3 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test332");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.setValue((byte) -91);
        byte byte6 = mutableByte0.byteValue();
        java.lang.String str7 = mutableByte0.toString();
        mutableByte0.decrement();
        long long9 = mutableByte0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -91 + "'", byte6 == (byte) -91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-91" + "'", str7.equals("-91"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-92L) + "'", long9 == (-92L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test333");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        int int7 = mutableByte1.intValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test334");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("0");
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean5 = mutableByte3.equals((java.lang.Object) 10L);
        float float6 = mutableByte3.floatValue();
        float float7 = mutableByte3.floatValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) float7);
        mutableByte1.setValue((java.lang.Number) float7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 11.0f + "'", float6 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 11.0f + "'", float7 == 11.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test335");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.Byte byte7 = mutableByte1.getValue();
        byte byte8 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test336");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        java.lang.Byte byte6 = mutableByte1.toByte();
        float float7 = mutableByte1.floatValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test337");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("-2");
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test338");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte4.add((byte) 21);
        double double7 = mutableByte4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 29.0d + "'", double7 == 29.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test339");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test340");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        mutableByte1.subtract((byte) 9);
        java.lang.Byte byte8 = mutableByte1.toByte();
        float float9 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -8 + "'", byte8.equals((byte) -8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-8.0f) + "'", float9 == (-8.0f));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test341");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((byte) 2);
        mutableByte1.subtract((byte) -79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test342");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        mutableByte1.decrement();
        float float8 = mutableByte1.floatValue();
        long long9 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 19.0f + "'", float8 == 19.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 19L + "'", long9 == 19L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test343");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        byte byte3 = mutableByte1.byteValue();
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.increment();
        float float6 = mutableByte1.floatValue();
        int int7 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test344");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.add((java.lang.Number) (short) 10);
        int int6 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test345");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        double double7 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test346");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.add((java.lang.Number) (short) 10);
        mutableByte1.increment();
        long long7 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21L + "'", long7 == 21L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test347");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        java.lang.Byte byte7 = mutableByte1.toByte();
        long long8 = mutableByte1.longValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test348");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        long long9 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test349");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.increment();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test350");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.setValue((byte) 20);
        java.lang.Byte byte5 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 20 + "'", byte5.equals((byte) 20));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test351");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        java.lang.String str5 = mutableByte1.toString();
        mutableByte1.setValue((byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "9" + "'", str5.equals("9"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test352");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 11.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test353");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double7 = mutableByte6.doubleValue();
        mutableByte6.decrement();
        int int9 = mutableByte1.compareTo(mutableByte6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test354");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.decrement();
        java.lang.Byte byte5 = mutableByte1.getValue();
        mutableByte1.decrement();
        byte byte7 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5.equals((byte) -1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -2 + "'", byte7 == (byte) -2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test355");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte5 = mutableByte4.getValue();
        double double6 = mutableByte4.doubleValue();
        mutableByte4.increment();
        int int8 = mutableByte1.compareTo(mutableByte4);
        double double9 = mutableByte4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test356");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -79);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test357");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        java.lang.String str6 = mutableByte1.toString();
        int int7 = mutableByte1.intValue();
        java.lang.Byte byte8 = mutableByte1.toByte();
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "2" + "'", str6.equals("2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 2 + "'", byte8.equals((byte) 2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 2 + "'", byte9 == (byte) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test358");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        float float2 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test359");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.subtract((byte) 0);
        mutableByte0.add((byte) 0);
        long long5 = mutableByte0.longValue();
        mutableByte0.add((byte) -90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test360");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        mutableByte1.add((byte) 0);
        java.lang.Byte byte7 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 9 + "'", byte7.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test361");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        int int5 = mutableByte1.intValue();
        float float6 = mutableByte1.floatValue();
        double double7 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 11 + "'", byte4 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 11.0f + "'", float6 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.0d + "'", double7 == 11.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test362");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 0);
        java.lang.Byte byte2 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2.equals((byte) 0));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test363");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        byte byte2 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test364");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        long long2 = mutableByte1.longValue();
        int int3 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test365");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 11 + "'", short5 == (short) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test366");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        double double2 = mutableByte1.doubleValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test367");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((byte) -91);
        mutableByte1.add((java.lang.Number) mutableByte6);
        long long8 = mutableByte6.longValue();
        java.lang.Byte byte9 = mutableByte6.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-91L) + "'", long8 == (-91L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -91 + "'", byte9.equals((byte) -91));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test368");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        float float7 = mutableByte6.floatValue();
        java.lang.String str8 = mutableByte6.toString();
        mutableByte6.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test369");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        float float4 = mutableByte1.floatValue();
        double double5 = mutableByte1.doubleValue();
        float float6 = mutableByte1.floatValue();
        java.lang.Byte byte7 = mutableByte1.toByte();
        byte byte8 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 11.0f + "'", float6 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7.equals((byte) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 11 + "'", byte8 == (byte) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test370");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test371");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.add((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte6 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 19 + "'", byte6.equals((byte) 19));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test372");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 0);
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 1.0f);
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test373");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        mutableByte0.increment();
        float float5 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test374");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte2.setValue((byte) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test375");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        double double4 = mutableByte1.doubleValue();
        double double5 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test376");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((byte) -91);
        mutableByte1.add((java.lang.Number) mutableByte6);
        int int8 = mutableByte6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-91) + "'", int8 == (-91));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test377");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        mutableByte1.add((byte) 20);
        float float4 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 22.0f + "'", float4 == 22.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test378");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        long long6 = mutableByte0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test379");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str6 = mutableByte5.toString();
        mutableByte1.setValue((java.lang.Number) mutableByte5);
        mutableByte5.setValue((byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test380");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        mutableByte0.setValue((byte) -1);
        java.lang.String str7 = mutableByte0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1" + "'", str7.equals("-1"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test381");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        java.lang.Byte byte5 = mutableByte1.getValue();
        java.lang.Byte byte6 = mutableByte1.toByte();
        java.lang.Class<?> wildcardClass7 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 11 + "'", byte4 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 11 + "'", byte5.equals((byte) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6.equals((byte) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test382");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.add((byte) -90);
        java.lang.Byte byte4 = mutableByte1.getValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) byte4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -79 + "'", byte4.equals((byte) -79));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test383");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 0);
        long long2 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test384");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        mutableByte1.add((byte) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test385");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.setValue((byte) -91);
        byte byte6 = mutableByte0.byteValue();
        mutableByte0.add((byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -91 + "'", byte6 == (byte) -91);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test386");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        mutableByte1.increment();
        float float4 = mutableByte1.floatValue();
        java.lang.String str5 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2" + "'", str5.equals("2"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test387");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.subtract((byte) 0);
        java.lang.Byte byte3 = mutableByte0.getValue();
        byte byte4 = mutableByte0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test388");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        mutableByte1.subtract((byte) 1);
        mutableByte1.decrement();
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 18 + "'", byte9.equals((byte) 18));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test389");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.decrement();
        mutableByte1.add((byte) 8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test390");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        mutableByte1.increment();
        mutableByte1.subtract((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test391");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.Byte byte6 = mutableByte1.toByte();
        float float7 = mutableByte1.floatValue();
        long long8 = mutableByte1.longValue();
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test392");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        java.lang.String str7 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test393");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        mutableByte1.increment();
        java.lang.Byte byte8 = mutableByte1.toByte();
        short short9 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 21 + "'", byte8.equals((byte) 21));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 21 + "'", short9 == (short) 21);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test394");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        byte byte8 = mutableByte6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 11 + "'", byte8 == (byte) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test395");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        float float7 = mutableByte6.floatValue();
        java.lang.String str8 = mutableByte6.toString();
        java.lang.Class<?> wildcardClass9 = mutableByte6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "10" + "'", str8.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test396");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test397");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        mutableByte0.increment();
        java.lang.Class<?> wildcardClass7 = mutableByte0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test398");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        java.lang.String str7 = mutableByte0.toString();
        mutableByte0.increment();
        short short9 = mutableByte0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test399");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        mutableByte0.decrement();
        int int8 = mutableByte0.intValue();
        double double9 = mutableByte0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test400");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte7 = mutableByte1.getValue();
        java.lang.Class<?> wildcardClass8 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test401");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.add((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        long long6 = mutableByte1.longValue();
        mutableByte1.subtract((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 19L + "'", long6 == 19L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test402");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("-91");
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        byte byte3 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 99);
        boolean boolean7 = mutableByte1.equals((java.lang.Object) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -91 + "'", byte3 == (byte) -91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test403");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        byte byte3 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 2 + "'", byte3 == (byte) 2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test404");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        mutableByte1.increment();
        short short6 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4.equals((byte) -91));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -90 + "'", short6 == (short) -90);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test405");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("-1");
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test406");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        float float4 = mutableByte1.floatValue();
        double double5 = mutableByte1.doubleValue();
        float float6 = mutableByte1.floatValue();
        java.lang.Byte byte7 = mutableByte1.toByte();
        short short8 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 11.0f + "'", float6 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7.equals((byte) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 11 + "'", short8 == (short) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test407");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        int int5 = mutableByte1.intValue();
        mutableByte1.add((byte) 100);
        java.lang.String str8 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "109" + "'", str8.equals("109"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test408");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        float float6 = mutableByte1.floatValue();
        double double7 = mutableByte1.doubleValue();
        int int8 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 20.0f + "'", float6 == 20.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test409");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        mutableByte1.decrement();
        mutableByte1.subtract((byte) 0);
        mutableByte1.decrement();
        byte byte8 = mutableByte1.byteValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 8 + "'", byte8 == (byte) 8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test410");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        float float9 = mutableByte8.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 11.0f + "'", float9 == 11.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test411");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        double double6 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) 100);
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test412");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test413");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test414");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        java.lang.Byte byte2 = mutableByte1.getValue();
        double double3 = mutableByte1.doubleValue();
        java.lang.String str4 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "10" + "'", str4.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test415");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        long long2 = mutableByte1.longValue();
        java.lang.String str3 = mutableByte1.toString();
        long long4 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test416");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.subtract((byte) 0);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test417");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        java.lang.Byte byte2 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2.equals((byte) 100));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test418");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        mutableByte1.add((byte) 0);
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test419");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        mutableByte1.increment();
        float float5 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test420");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        double double6 = mutableByte0.doubleValue();
        java.lang.Byte byte7 = mutableByte0.getValue();
        float float8 = mutableByte0.floatValue();
        int int9 = mutableByte0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test421");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.add((java.lang.Number) (short) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableByte1.subtract(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test422");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        byte byte8 = mutableByte1.byteValue();
        long long9 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2L) + "'", long9 == (-2L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test423");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        mutableByte0.add((byte) 21);
        float float8 = mutableByte0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 21.0f + "'", float8 == 21.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test424");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        java.lang.Byte byte7 = mutableByte1.toByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte9 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7.equals((byte) 100));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test425");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4.equals((byte) -91));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-91.0d) + "'", double5 == (-91.0d));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test426");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        byte byte5 = mutableByte1.byteValue();
        double double6 = mutableByte1.doubleValue();
        java.lang.Byte byte7 = mutableByte1.getValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test427");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        long long7 = mutableByte1.longValue();
        java.lang.String str8 = mutableByte1.toString();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test428");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        long long8 = mutableByte1.longValue();
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2L) + "'", long8 == (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -2 + "'", byte9 == (byte) -2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test429");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        byte byte8 = mutableByte1.byteValue();
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test430");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        java.lang.String str7 = mutableByte1.toString();
        int int8 = mutableByte1.intValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test431");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        double double2 = mutableByte1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test432");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        double double7 = mutableByte1.doubleValue();
        java.lang.Byte byte8 = mutableByte1.getValue();
        double double9 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test433");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.setValue((byte) 0);
        java.lang.Byte byte6 = mutableByte0.getValue();
        mutableByte0.decrement();
        java.lang.Byte byte8 = mutableByte0.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8.equals((byte) -1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test434");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test435");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte6.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte6);
        mutableByte6.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test436");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        java.lang.String str6 = mutableByte0.toString();
        java.lang.Byte byte7 = mutableByte0.getValue();
        java.lang.Byte byte8 = mutableByte0.toByte();
        java.lang.Byte byte9 = mutableByte0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9.equals((byte) 0));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test437");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        mutableByte1.subtract((byte) 0);
        mutableByte1.setValue((byte) 11);
        mutableByte1.add((byte) 18);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test438");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        float float4 = mutableByte1.floatValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) float4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test439");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.add((byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4 == (byte) -91);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test440");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte3 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 2 + "'", byte3.equals((byte) 2));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test441");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        long long5 = mutableByte4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 8L + "'", long5 == 8L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test442");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        java.lang.Byte byte4 = mutableByte1.getValue();
        java.lang.Byte byte5 = mutableByte1.getValue();
        java.lang.Byte byte6 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test443");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.String str7 = mutableByte6.toString();
        float float8 = mutableByte6.floatValue();
        double double9 = mutableByte6.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test444");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("19");
        float float2 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.0f + "'", float2 == 19.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test445");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double6 = mutableByte5.doubleValue();
        mutableByte1.add((java.lang.Number) double6);
        mutableByte1.subtract((byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test446");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 99);
        mutableByte4.subtract((byte) -91);
        long long7 = mutableByte4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-66L) + "'", long7 == (-66L));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test447");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        int int4 = mutableByte1.intValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double7 = mutableByte6.doubleValue();
        mutableByte1.subtract((java.lang.Number) double7);
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 11.0d + "'", double7 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test448");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((byte) -91);
        mutableByte1.add((java.lang.Number) mutableByte6);
        mutableByte6.decrement();
        java.lang.Byte byte9 = mutableByte6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -92 + "'", byte9.equals((byte) -92));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test449");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        byte byte6 = mutableByte0.byteValue();
        mutableByte0.decrement();
        mutableByte0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test450");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        double double5 = mutableByte1.doubleValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4.equals((byte) -91));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-91.0d) + "'", double5 == (-91.0d));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test451");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.setValue((byte) -91);
        byte byte6 = mutableByte0.byteValue();
        java.lang.Class<?> wildcardClass7 = mutableByte0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -91 + "'", byte6 == (byte) -91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test452");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("109");
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test453");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        long long4 = mutableByte1.longValue();
        long long5 = mutableByte1.longValue();
        mutableByte1.decrement();
        int int7 = mutableByte1.intValue();
        byte byte8 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test454");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) -90);
        short short8 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -90 + "'", short8 == (short) -90);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test455");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.setValue((byte) 100);
        mutableByte1.decrement();
        java.lang.Byte byte5 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 99 + "'", byte5.equals((byte) 99));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test456");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 18);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test457");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        byte byte5 = mutableByte1.byteValue();
        float float6 = mutableByte1.floatValue();
        mutableByte1.decrement();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableByte1.setValue(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 9.0f + "'", float6 == 9.0f);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test458");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("100");
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test459");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        mutableByte0.setValue((byte) -1);
        float float7 = mutableByte0.floatValue();
        int int8 = mutableByte0.intValue();
        mutableByte0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test460");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        mutableByte0.add((java.lang.Number) 10.0d);
        int int8 = mutableByte0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test461");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        long long4 = mutableByte1.longValue();
        long long5 = mutableByte1.longValue();
        mutableByte1.increment();
        mutableByte1.setValue((byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test462");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.increment();
        int int6 = mutableByte1.intValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test463");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        int int5 = mutableByte1.intValue();
        byte byte6 = mutableByte1.byteValue();
        byte byte7 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 11 + "'", byte4 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7 == (byte) 11);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test464");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test465");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        mutableByte1.increment();
        long long8 = mutableByte1.longValue();
        long long9 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21L + "'", long8 == 21L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21L + "'", long9 == 21L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test466");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 99);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test467");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte5 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 11 + "'", byte5.equals((byte) 11));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test468");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        long long6 = mutableByte1.longValue();
        mutableByte1.decrement();
        mutableByte1.decrement();
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 8 + "'", byte9 == (byte) 8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test469");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -8);
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -8 + "'", short2 == (short) -8);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test470");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("-91");
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte6);
        byte byte8 = mutableByte6.byteValue();
        mutableByte4.setValue((java.lang.Number) byte8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -91 + "'", byte8 == (byte) -91);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test471");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        byte byte3 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) -1);
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test472");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.add((byte) 9);
        java.lang.String str5 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte7.decrement();
        int int9 = mutableByte1.compareTo(mutableByte7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "19" + "'", str5.equals("19"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test473");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        int int6 = mutableByte0.intValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) int6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test474");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        byte byte8 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8 == (byte) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test475");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        java.lang.Byte byte2 = mutableByte1.getValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test476");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.subtract((java.lang.Number) (byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test477");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.subtract((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test478");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        byte byte8 = mutableByte1.byteValue();
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -2 + "'", byte8 == (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -2 + "'", byte9 == (byte) -2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test479");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        double double6 = mutableByte1.doubleValue();
        double double7 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test480");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte6 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test481");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.increment();
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9.equals((byte) 11));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test482");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        int int4 = mutableByte1.intValue();
        java.lang.Byte byte5 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5.equals((byte) 10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test483");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        mutableByte1.increment();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test484");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        java.lang.Byte byte4 = mutableByte1.getValue();
        java.lang.String str5 = mutableByte1.toString();
        int int6 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test485");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test486");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        long long7 = mutableByte1.longValue();
        java.lang.Byte byte8 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20L + "'", long7 == 20L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 20 + "'", byte8.equals((byte) 20));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test487");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        java.lang.Byte byte6 = mutableByte1.toByte();
        java.lang.Class<?> wildcardClass7 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6.equals((byte) 20));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test488");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("-91");
        java.lang.Byte byte2 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -91 + "'", byte2.equals((byte) -91));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test489");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        long long6 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test490");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("12");
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double4 = mutableByte3.doubleValue();
        mutableByte3.decrement();
        boolean boolean6 = mutableByte1.equals((java.lang.Object) mutableByte3);
        byte byte7 = mutableByte3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 9 + "'", byte7 == (byte) 9);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test491");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        mutableByte1.decrement();
        float float7 = mutableByte1.floatValue();
        java.lang.Byte byte8 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8.equals((byte) 0));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test492");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 0);
        java.lang.Byte byte2 = mutableByte1.getValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test493");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double2 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.setValue((byte) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test494");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        mutableByte0.increment();
        float float5 = mutableByte0.floatValue();
        java.lang.String str6 = mutableByte0.toString();
        byte byte7 = mutableByte0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test495");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte6.subtract((byte) 0);
        int int9 = mutableByte6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test496");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.add((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Class<?> wildcardClass6 = mutableByte5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test497");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        java.lang.Byte byte6 = mutableByte1.getValue();
        long long7 = mutableByte1.longValue();
        java.lang.Byte byte8 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9L + "'", long7 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8.equals((byte) 9));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test498");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        java.lang.String str6 = mutableByte1.toString();
        java.lang.Byte byte7 = mutableByte1.toByte();
        long long8 = mutableByte1.longValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test499");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 20);
        int int7 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-10) + "'", int7 == (-10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test500");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        int int7 = mutableByte1.intValue();
        double double8 = mutableByte1.doubleValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
    }
}

