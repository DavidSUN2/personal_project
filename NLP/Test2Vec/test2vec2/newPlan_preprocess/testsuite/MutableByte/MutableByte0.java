package MutableByte;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableByte0 {

    public static boolean debug = false;

    @Test
    public void MutableByte001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte001");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.Class<?> wildcardClass5 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableByte002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte002");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.Class<?> wildcardClass2 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte003");
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
    public void MutableByte004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte004");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in MutableByte generation
        try {
            mutableByte1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableByte005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte005");
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
    public void MutableByte006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte006");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        short short7 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void MutableByte007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte007");
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
    public void MutableByte008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte008");
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
    public void MutableByte009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte009");
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
    public void MutableByte010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte010");
        // The following exception was thrown during execution in MutableByte generation
        try {
            org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableByte011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte011");
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
    public void MutableByte012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte012");
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
    public void MutableByte013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte013");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableByte014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte014");
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
    public void MutableByte015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte015");
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
    public void MutableByte016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte016");
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
    public void MutableByte017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte017");
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
    public void MutableByte018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte018");
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
    public void MutableByte019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte019");
        // The following exception was thrown during execution in MutableByte generation
        try {
            org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableByte020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte020");
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
    public void MutableByte021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte021");
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
    public void MutableByte022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte022");
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
    public void MutableByte023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte023");
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
    public void MutableByte024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte024");
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
    public void MutableByte025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte025");
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
    public void MutableByte026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte026");
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
    public void MutableByte027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte027");
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
    public void MutableByte028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte028");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void MutableByte029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte029");
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
    public void MutableByte030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte030");
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
    public void MutableByte031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte031");
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
    public void MutableByte032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte032");
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
    public void MutableByte033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte033");
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
    public void MutableByte034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte034");
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
    public void MutableByte035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte035");
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
    public void MutableByte036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte036");
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
    public void MutableByte037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte037");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableByte038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte038");
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
    public void MutableByte039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte039");
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
    public void MutableByte040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte040");
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
    public void MutableByte041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte041");
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
    public void MutableByte042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte042");
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
    public void MutableByte043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte043");
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
    public void MutableByte044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte044");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableByte generation
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
    public void MutableByte045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte045");
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
    public void MutableByte046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte046");
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
    public void MutableByte047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte047");
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
    public void MutableByte048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte048");
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
    public void MutableByte049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte049");
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
    public void MutableByte050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte050");
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
    public void MutableByte051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte051");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableByte052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte052");
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
    public void MutableByte053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte053");
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
    public void MutableByte054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte054");
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
    public void MutableByte055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte055");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -91 + "'", short4 == (short) -91);
    }

    @Test
    public void MutableByte056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte056");
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
    public void MutableByte057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte057");
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
    public void MutableByte058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte058");
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
    public void MutableByte059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte059");
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
    public void MutableByte060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte060");
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
    public void MutableByte061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte061");
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
    public void MutableByte062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte062");
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
    public void MutableByte063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte063");
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
    public void MutableByte064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte064");
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
    public void MutableByte065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte065");
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
    public void MutableByte066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte066");
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
    public void MutableByte067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte067");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableByte068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte068");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        float float2 = mutableByte1.floatValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableByte069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte069");
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
    public void MutableByte070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte070");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in MutableByte generation
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
    public void MutableByte071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte071");
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
    public void MutableByte072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte072");
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
    public void MutableByte073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte073");
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
    public void MutableByte074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte074");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        java.lang.Class<?> wildcardClass2 = mutableByte0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte075");
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
    public void MutableByte076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte076");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        mutableByte1.add((byte) -1);
    }

    @Test
    public void MutableByte077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte077");
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
    public void MutableByte078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte078");
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
    public void MutableByte079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte079");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
    }

    @Test
    public void MutableByte080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte080");
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
    public void MutableByte081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte081");
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
    public void MutableByte082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte082");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 11 + "'", short2 == (short) 11);
    }

    @Test
    public void MutableByte083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte083");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        java.lang.Byte byte4 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4.equals((byte) 0));
    }

    @Test
    public void MutableByte084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte084");
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
    public void MutableByte085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte085");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        mutableByte1.add((byte) 20);
        java.lang.Class<?> wildcardClass4 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableByte086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte086");
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
    public void MutableByte087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte087");
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
    public void MutableByte088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte088");
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
    public void MutableByte089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte089");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableByte090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte090");
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
    public void MutableByte091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte091");
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
    public void MutableByte092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte092");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in MutableByte generation
        try {
            mutableByte1.setValue(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableByte093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte093");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        short short8 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -2 + "'", short8 == (short) -2);
    }

    @Test
    public void MutableByte094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte094");
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
    public void MutableByte095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte095");
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
    public void MutableByte096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte096");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void MutableByte097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte097");
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
    public void MutableByte098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte098");
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
    public void MutableByte099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte099");
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
    public void MutableByte100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte100");
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
    public void MutableByte101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte101");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.setValue((byte) 9);
        mutableByte1.setValue((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
    }

    @Test
    public void MutableByte102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte102");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        java.lang.Class<?> wildcardClass4 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableByte103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte103");
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
    public void MutableByte104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte104");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("100");
        int int2 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableByte105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte105");
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
    public void MutableByte106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte106");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        mutableByte1.subtract((java.lang.Number) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void MutableByte107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte107");
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
    public void MutableByte108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte108");
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
    public void MutableByte109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte109");
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
    public void MutableByte110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte110");
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
    public void MutableByte111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte111");
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
    public void MutableByte112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte112");
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
    public void MutableByte113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte113");
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
    public void MutableByte114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte114");
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
    public void MutableByte115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte115");
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
    public void MutableByte116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte116");
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
    public void MutableByte117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte117");
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
    public void MutableByte118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte118");
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
    public void MutableByte119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte119");
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
    public void MutableByte120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte120");
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
    public void MutableByte121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte121");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        mutableByte1.setValue((byte) 0);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableByte122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte122");
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
    public void MutableByte123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte123");
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
    public void MutableByte124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte124");
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
    public void MutableByte125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte125");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        int int2 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void MutableByte126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte126");
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
    public void MutableByte127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte127");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        java.lang.Class<?> wildcardClass4 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableByte128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte128");
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
    public void MutableByte129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte129");
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
    public void MutableByte130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte130");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        long long2 = mutableByte0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableByte131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte131");
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
    public void MutableByte132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte132");
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
    public void MutableByte133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte133");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        double double2 = mutableByte1.doubleValue();
        int int3 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void MutableByte134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte134");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.add((byte) 0);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableByte135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte135");
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
    public void MutableByte136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte136");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte137");
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
    public void MutableByte138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte138");
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
    public void MutableByte139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte139");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
    }

    @Test
    public void MutableByte140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte140");
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
    public void MutableByte141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte141");
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
    public void MutableByte142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte142");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 20);
    }

    @Test
    public void MutableByte143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte143");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        long long3 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void MutableByte144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte144");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Class<?> wildcardClass2 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte145");
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
    public void MutableByte146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte146");
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
    public void MutableByte147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte147");
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
    public void MutableByte148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte148");
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
    public void MutableByte149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte149");
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
    public void MutableByte150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte150");
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
    public void MutableByte151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte151");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 0);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.String str3 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableByte152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte152");
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
    public void MutableByte153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte153");
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
    public void MutableByte154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte154");
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
    public void MutableByte155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte155");
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
    public void MutableByte156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte156");
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
    public void MutableByte157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte157");
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
    public void MutableByte158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte158");
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
    public void MutableByte159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte159");
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
    public void MutableByte160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte160");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        double double4 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) double4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void MutableByte161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte161");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableByte162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte162");
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
    public void MutableByte163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte163");
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
    public void MutableByte164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte164");
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
    public void MutableByte165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte165");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableByte166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte166");
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
    public void MutableByte167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte167");
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
    public void MutableByte168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte168");
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
    public void MutableByte169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte169");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 0.0d);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 9 + "'", short4 == (short) 9);
    }

    @Test
    public void MutableByte170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte170");
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
    public void MutableByte171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte171");
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
    public void MutableByte172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte172");
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
    public void MutableByte173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte173");
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
    public void MutableByte174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte174");
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
    public void MutableByte175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte175");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        mutableByte1.setValue((byte) 0);
        int int4 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableByte176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte176");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        mutableByte1.add((byte) 0);
        java.lang.Byte byte4 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4.equals((byte) -1));
    }

    @Test
    public void MutableByte177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte177");
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
    public void MutableByte178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte178");
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
    public void MutableByte179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte179");
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
    public void MutableByte180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte180");
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
    public void MutableByte181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte181");
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
    public void MutableByte182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte182");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        mutableByte1.setValue((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableByte183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte183");
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
    public void MutableByte184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte184");
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
    public void MutableByte185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte185");
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
    public void MutableByte186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte186");
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
    public void MutableByte187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte187");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.setValue((byte) 100);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void MutableByte188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte188");
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
    public void MutableByte189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte189");
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
    public void MutableByte190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte190");
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
    public void MutableByte191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte191");
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
    public void MutableByte192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte192");
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
    public void MutableByte193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte193");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        java.lang.Class<?> wildcardClass2 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte194");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (-1.0f));
    }

    @Test
    public void MutableByte195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte195");
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
    public void MutableByte196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte196");
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
    public void MutableByte197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte197");
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
    public void MutableByte198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte198");
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
    public void MutableByte199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte199");
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
    public void MutableByte200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte200");
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
    public void MutableByte201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte201");
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
    public void MutableByte202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte202");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        long long2 = mutableByte1.longValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableByte203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte203");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        mutableByte3.subtract((java.lang.Number) (-1.0f));
        mutableByte1.add((java.lang.Number) (-1.0f));
        java.lang.Byte byte7 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 99 + "'", byte7.equals((byte) 99));
    }

    @Test
    public void MutableByte204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte204");
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
    public void MutableByte205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte205");
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
    public void MutableByte206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte206");
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
    public void MutableByte207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte207");
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
    public void MutableByte208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte208");
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
    public void MutableByte209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte209");
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
    public void MutableByte210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte210");
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
    public void MutableByte211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte211");
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
    public void MutableByte212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte212");
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
    public void MutableByte213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte213");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        java.lang.Class<?> wildcardClass4 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableByte214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte214");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        int int2 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void MutableByte215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte215");
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
    public void MutableByte216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte216");
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
    public void MutableByte217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte217");
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
    public void MutableByte218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte218");
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
    public void MutableByte219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte219");
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
    public void MutableByte220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte220");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        byte byte5 = mutableByte1.byteValue();
        mutableByte1.setValue((byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableByte221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte221");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void MutableByte222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte222");
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
    public void MutableByte223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte223");
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
    public void MutableByte224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte224");
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
    public void MutableByte225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte225");
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
    public void MutableByte226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte226");
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
    public void MutableByte227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte227");
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
    public void MutableByte228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte228");
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
    public void MutableByte229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte229");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -90);
    }

    @Test
    public void MutableByte230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte230");
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
    public void MutableByte231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte231");
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
    public void MutableByte232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte232");
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
    public void MutableByte233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte233");
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
    public void MutableByte234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte234");
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
    public void MutableByte235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte235");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
    }

    @Test
    public void MutableByte236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte236");
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
    public void MutableByte237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte237");
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
    public void MutableByte238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte238");
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
    public void MutableByte239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte239");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        double double4 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 12.0d + "'", double4 == 12.0d);
    }

    @Test
    public void MutableByte240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte240");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.add((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableByte241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte241");
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
    public void MutableByte242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte242");
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
    public void MutableByte243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte243");
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
    public void MutableByte244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte244");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 21);
    }

    @Test
    public void MutableByte245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte245");
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
    public void MutableByte246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte246");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 99);
        java.lang.Byte byte5 = mutableByte4.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 99 + "'", byte5.equals((byte) 99));
    }

    @Test
    public void MutableByte247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte247");
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
    public void MutableByte248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte248");
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
    public void MutableByte249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte249");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        mutableByte1.setValue((byte) 9);
    }

    @Test
    public void MutableByte250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte250");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 20);
        mutableByte1.setValue((byte) -2);
        mutableByte1.setValue((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void MutableByte251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte251");
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
    public void MutableByte252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte252");
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
    public void MutableByte253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte253");
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
    public void MutableByte254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte254");
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
    public void MutableByte255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte255");
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
    public void MutableByte256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte256");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.subtract((byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
    }

    @Test
    public void MutableByte257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte257");
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
    public void MutableByte258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte258");
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
    public void MutableByte259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte259");
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
    public void MutableByte260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte260");
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
    public void MutableByte261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte261");
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
    public void MutableByte262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte262");
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
    public void MutableByte263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte263");
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
    public void MutableByte264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte264");
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
    public void MutableByte265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte265");
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
    public void MutableByte266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte266");
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
    public void MutableByte267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte267");
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
    public void MutableByte268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte268");
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
    public void MutableByte269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte269");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 2 + "'", short2 == (short) 2);
    }

    @Test
    public void MutableByte270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte270");
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
    public void MutableByte271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte271");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 9);
        mutableByte1.subtract((byte) 2);
    }

    @Test
    public void MutableByte272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte272");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        mutableByte1.subtract((byte) 0);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 2 + "'", short4 == (short) 2);
    }

    @Test
    public void MutableByte273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte273");
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
    public void MutableByte274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte274");
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
    public void MutableByte275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte275");
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
    public void MutableByte276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte276");
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
    public void MutableByte277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte277");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        java.lang.Byte byte3 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 9 + "'", byte3.equals((byte) 9));
    }

    @Test
    public void MutableByte278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte278");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.decrement();
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte279");
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
    public void MutableByte280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte280");
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
    public void MutableByte281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte281");
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
    public void MutableByte282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte282");
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
    public void MutableByte283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte283");
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
    public void MutableByte284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte284");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("20");
    }

    @Test
    public void MutableByte285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte285");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        int int6 = mutableByte5.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void MutableByte286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte286");
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
    public void MutableByte287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte287");
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
    public void MutableByte288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte288");
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
    public void MutableByte289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte289");
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
    public void MutableByte290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte290");
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
    public void MutableByte291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte291");
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
    public void MutableByte292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte292");
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
    public void MutableByte293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte293");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void MutableByte294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte294");
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
    public void MutableByte295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte295");
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
    public void MutableByte296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte296");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        double double2 = mutableByte1.doubleValue();
        float float3 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void MutableByte297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte297");
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
    public void MutableByte298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte298");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        java.lang.String str4 = mutableByte1.toString();
        mutableByte1.setValue((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "12" + "'", str4.equals("12"));
    }

    @Test
    public void MutableByte299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte299");
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
    public void MutableByte300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte300");
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
    public void MutableByte301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte301");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100L);
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void MutableByte302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte302");
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
    public void MutableByte303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte303");
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
    public void MutableByte304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte304");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.add((java.lang.Number) 2L);
    }

    @Test
    public void MutableByte305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte305");
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
    public void MutableByte306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte306");
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
    public void MutableByte307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte307");
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
    public void MutableByte308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte308");
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
    public void MutableByte309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte309");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte310");
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
    public void MutableByte311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte311");
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
    public void MutableByte312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte312");
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
    public void MutableByte313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte313");
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
    public void MutableByte314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte314");
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
    public void MutableByte315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte315");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        java.lang.Byte byte2 = mutableByte1.getValue();
        mutableByte1.decrement();
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in MutableByte generation
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
    public void MutableByte316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte316");
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
    public void MutableByte317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte317");
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
    public void MutableByte318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte318");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        mutableByte1.setValue((byte) 0);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte319");
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
    public void MutableByte320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte320");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.subtract((byte) 0);
        int int4 = mutableByte1.intValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void MutableByte321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte321");
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
    public void MutableByte322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte322");
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
    public void MutableByte323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte323");
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
    public void MutableByte324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte324");
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
    public void MutableByte325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte325");
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
    public void MutableByte326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte326");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        java.lang.Byte byte2 = mutableByte1.getValue();
        int int3 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void MutableByte327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte327");
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
    public void MutableByte328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte328");
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
    public void MutableByte329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte329");
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
    public void MutableByte330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte330");
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
    public void MutableByte331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte331");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Class<?> wildcardClass3 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableByte332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte332");
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
    public void MutableByte333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte333");
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
    public void MutableByte334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte334");
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
    public void MutableByte335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte335");
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
    public void MutableByte336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte336");
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
    public void MutableByte337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte337");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("-2");
    }

    @Test
    public void MutableByte338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte338");
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
    public void MutableByte339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte339");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void MutableByte340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte340");
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
    public void MutableByte341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte341");
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
    public void MutableByte342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte342");
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
    public void MutableByte343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte343");
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
    public void MutableByte344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte344");
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
    public void MutableByte345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte345");
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
    public void MutableByte346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte346");
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
    public void MutableByte347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte347");
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
    public void MutableByte348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte348");
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
    public void MutableByte349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte349");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.increment();
    }

    @Test
    public void MutableByte350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte350");
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
    public void MutableByte351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte351");
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
    public void MutableByte352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte352");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 11.0f);
    }

    @Test
    public void MutableByte353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte353");
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
    public void MutableByte354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte354");
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
    public void MutableByte355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte355");
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
    public void MutableByte356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte356");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -79);
    }

    @Test
    public void MutableByte357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte357");
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
    public void MutableByte358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte358");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        float float2 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void MutableByte359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte359");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.subtract((byte) 0);
        mutableByte0.add((byte) 0);
        long long5 = mutableByte0.longValue();
        mutableByte0.add((byte) -90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableByte360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte360");
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
    public void MutableByte361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte361");
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
    public void MutableByte362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte362");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 0);
        java.lang.Byte byte2 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2.equals((byte) 0));
    }

    @Test
    public void MutableByte363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte363");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        byte byte2 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableByte364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte364");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        long long2 = mutableByte1.longValue();
        int int3 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void MutableByte365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte365");
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
    public void MutableByte366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte366");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        double double2 = mutableByte1.doubleValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableByte367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte367");
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
    public void MutableByte368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte368");
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
    public void MutableByte369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte369");
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
    public void MutableByte370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte370");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableByte371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte371");
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
    public void MutableByte372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte372");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 0);
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 1.0f);
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableByte373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte373");
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
    public void MutableByte374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte374");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte2.setValue((byte) 9);
    }

    @Test
    public void MutableByte375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte375");
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
    public void MutableByte376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte376");
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
    public void MutableByte377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte377");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        mutableByte1.add((byte) 20);
        float float4 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 22.0f + "'", float4 == 22.0f);
    }

    @Test
    public void MutableByte378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte378");
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
    public void MutableByte379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte379");
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
    public void MutableByte380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte380");
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
    public void MutableByte381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte381");
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
    public void MutableByte382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte382");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.add((byte) -90);
        java.lang.Byte byte4 = mutableByte1.getValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) byte4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -79 + "'", byte4.equals((byte) -79));
    }

    @Test
    public void MutableByte383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte383");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 0);
        long long2 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableByte384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte384");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        mutableByte1.add((byte) 2);
    }

    @Test
    public void MutableByte385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte385");
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
    public void MutableByte386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte386");
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
    public void MutableByte387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte387");
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
    public void MutableByte388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte388");
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
    public void MutableByte389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte389");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.decrement();
        mutableByte1.add((byte) 8);
    }

    @Test
    public void MutableByte390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte390");
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
    public void MutableByte391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte391");
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
    public void MutableByte392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte392");
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
    public void MutableByte393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte393");
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
    public void MutableByte394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte394");
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
    public void MutableByte395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte395");
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
    public void MutableByte396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte396");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableByte397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte397");
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
    public void MutableByte398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte398");
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
    public void MutableByte399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte399");
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
    public void MutableByte400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte400");
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
    public void MutableByte401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte401");
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
    public void MutableByte402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte402");
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
    public void MutableByte403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte403");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        byte byte3 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 2 + "'", byte3 == (byte) 2);
    }

    @Test
    public void MutableByte404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte404");
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
    public void MutableByte405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte405");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("-1");
    }

    @Test
    public void MutableByte406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte406");
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
    public void MutableByte407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte407");
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
    public void MutableByte408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte408");
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
    public void MutableByte409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte409");
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
    public void MutableByte410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte410");
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
    public void MutableByte411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte411");
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
    public void MutableByte412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte412");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableByte413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte413");
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
    public void MutableByte414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte414");
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
    public void MutableByte415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte415");
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
    public void MutableByte416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte416");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.subtract((byte) 0);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 0);
    }

    @Test
    public void MutableByte417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte417");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        java.lang.Byte byte2 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2.equals((byte) 100));
    }

    @Test
    public void MutableByte418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte418");
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
    public void MutableByte419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte419");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        mutableByte1.increment();
        float float5 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableByte420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte420");
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
    public void MutableByte421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte421");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.add((java.lang.Number) (short) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableByte generation
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
    public void MutableByte422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte422");
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
    public void MutableByte423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte423");
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
    public void MutableByte424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte424");
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
    public void MutableByte425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte425");
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
    public void MutableByte426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte426");
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
    public void MutableByte427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte427");
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
    public void MutableByte428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte428");
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
    public void MutableByte429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte429");
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
    public void MutableByte430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte430");
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
    public void MutableByte431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte431");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        double double2 = mutableByte1.doubleValue();
        java.lang.Class<?> wildcardClass3 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableByte432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte432");
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
    public void MutableByte433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte433");
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
    public void MutableByte434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte434");
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
    public void MutableByte435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte435");
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
    public void MutableByte436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte436");
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
    public void MutableByte437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte437");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        mutableByte1.subtract((byte) 0);
        mutableByte1.setValue((byte) 11);
        mutableByte1.add((byte) 18);
    }

    @Test
    public void MutableByte438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte438");
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
    public void MutableByte439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte439");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        byte byte4 = mutableByte1.byteValue();
        mutableByte1.add((byte) 99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4 == (byte) -91);
    }

    @Test
    public void MutableByte440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte440");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte3 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 2 + "'", byte3.equals((byte) 2));
    }

    @Test
    public void MutableByte441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte441");
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
    public void MutableByte442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte442");
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
    public void MutableByte443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte443");
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
    public void MutableByte444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte444");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("19");
        float float2 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.0f + "'", float2 == 19.0f);
    }

    @Test
    public void MutableByte445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte445");
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
    public void MutableByte446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte446");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 99);
        mutableByte4.subtract((byte) -91);
        long long7 = mutableByte4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-66L) + "'", long7 == (-66L));
    }

    @Test
    public void MutableByte447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte447");
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
    public void MutableByte448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte448");
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
    public void MutableByte449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte449");
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
    public void MutableByte450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte450");
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
    public void MutableByte451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte451");
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
    public void MutableByte452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte452");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("109");
    }

    @Test
    public void MutableByte453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte453");
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
    public void MutableByte454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte454");
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
    public void MutableByte455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte455");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.setValue((byte) 100);
        mutableByte1.decrement();
        java.lang.Byte byte5 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 99 + "'", byte5.equals((byte) 99));
    }

    @Test
    public void MutableByte456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte456");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 18);
    }

    @Test
    public void MutableByte457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte457");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        byte byte5 = mutableByte1.byteValue();
        float float6 = mutableByte1.floatValue();
        mutableByte1.decrement();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableByte generation
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
    public void MutableByte458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte458");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("100");
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
    }

    @Test
    public void MutableByte459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte459");
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
    public void MutableByte460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte460");
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
    public void MutableByte461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte461");
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
    public void MutableByte462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte462");
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
    public void MutableByte463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte463");
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
    public void MutableByte464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte464");
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
    public void MutableByte465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte465");
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
    public void MutableByte466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte466");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte1.setValue((byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 99);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (byte) 99);
    }

    @Test
    public void MutableByte467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte467");
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
    public void MutableByte468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte468");
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
    public void MutableByte469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte469");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -8);
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -8 + "'", short2 == (short) -8);
    }

    @Test
    public void MutableByte470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte470");
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
    public void MutableByte471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte471");
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
    public void MutableByte472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte472");
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
    public void MutableByte473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte473");
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
    public void MutableByte474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte474");
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
    public void MutableByte475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte475");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        java.lang.Byte byte2 = mutableByte1.getValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void MutableByte476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte476");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.subtract((java.lang.Number) (byte) 10);
        double double5 = mutableByte1.doubleValue();
        mutableByte1.setValue((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void MutableByte477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte477");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.subtract((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
    }

    @Test
    public void MutableByte478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte478");
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
    public void MutableByte479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte479");
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
    public void MutableByte480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte480");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte6 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
    }

    @Test
    public void MutableByte481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte481");
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
    public void MutableByte482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte482");
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
    public void MutableByte483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte483");
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
    public void MutableByte484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte484");
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
    public void MutableByte485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte485");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte0);
    }

    @Test
    public void MutableByte486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte486");
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
    public void MutableByte487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte487");
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
    public void MutableByte488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte488");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("-91");
        java.lang.Byte byte2 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -91 + "'", byte2.equals((byte) -91));
    }

    @Test
    public void MutableByte489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte489");
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
    public void MutableByte490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte490");
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
    public void MutableByte491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte491");
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
    public void MutableByte492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte492");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 0);
        java.lang.Byte byte2 = mutableByte1.getValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void MutableByte493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte493");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double2 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.setValue((byte) 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void MutableByte494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte494");
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
    public void MutableByte495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte495");
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
    public void MutableByte496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte496");
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
    public void MutableByte497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte497");
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
    public void MutableByte498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte498");
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
    public void MutableByte499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte499");
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
    public void MutableByte500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.MutableByte500");
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

