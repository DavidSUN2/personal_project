
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
            System.out.format("%n%s%n", "MutableByte0.test01");
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
            System.out.format("%n%s%n", "MutableByte0.test02");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        java.lang.Byte byte2 = mutableByte1.toByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str5 = mutableByte4.toString();
        int int6 = mutableByte1.compareTo(mutableByte4);
        long long7 = mutableByte4.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test03");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.decrement();
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test04");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        mutableByte1.setValue((java.lang.Number) (byte) 10);
        short short4 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test05");
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
            System.out.format("%n%s%n", "MutableByte0.test06");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        mutableByte1.setValue((java.lang.Number) (byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte5.setValue((byte) 100);
        mutableByte1.setValue((java.lang.Number) (byte) 100);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test07");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 0);
        java.lang.Byte byte2 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2.equals((byte) 0));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test08");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str6 = mutableByte5.toString();
        double double7 = mutableByte5.doubleValue();
        mutableByte1.subtract((java.lang.Number) double7);
        short short9 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test09");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        java.lang.Byte byte2 = mutableByte1.toByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str5 = mutableByte4.toString();
        int int6 = mutableByte1.compareTo(mutableByte4);
        short short7 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test10");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test11");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.decrement();
        byte byte4 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test12");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        java.lang.Byte byte2 = mutableByte1.toByte();
        mutableByte1.add((byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test13");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.decrement();
        mutableByte0.decrement();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test14");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.setValue((java.lang.Number) 1);
        int int4 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test15");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 0.0d);
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test16");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.setValue((java.lang.Number) 1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str6 = mutableByte5.toString();
        mutableByte5.decrement();
        mutableByte1.add((java.lang.Number) mutableByte5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test17");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        double double3 = mutableByte1.doubleValue();
        java.lang.Byte byte4 = mutableByte1.toByte();
        mutableByte1.subtract((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test18");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        mutableByte1.setValue((java.lang.Number) (byte) 10);
        mutableByte1.subtract((byte) 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test19");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test20");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.decrement();
        mutableByte0.add((byte) 100);
        mutableByte0.decrement();
        short short5 = mutableByte0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 98 + "'", short5 == (short) 98);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test21");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        java.lang.String str1 = mutableByte0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test22");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test23");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.Class<?> wildcardClass2 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test24");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test25");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        java.lang.Object obj1 = null;
        boolean boolean2 = mutableByte0.equals(obj1);
        mutableByte0.subtract((byte) 0);
        int int5 = mutableByte0.intValue();
        java.lang.Byte byte6 = mutableByte0.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6.equals((byte) 0));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test26");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        java.lang.Object obj1 = null;
        boolean boolean2 = mutableByte0.equals(obj1);
        mutableByte0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test27");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 0.0d);
        java.lang.Class<?> wildcardClass2 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test28");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("0");
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test29");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        short short3 = mutableByte2.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test30");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.decrement();
        mutableByte1.setValue((byte) 0);
        java.lang.Class<?> wildcardClass6 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test31");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test32");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.setValue((java.lang.Number) 1);
        java.lang.String str4 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test33");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.subtract((java.lang.Number) (byte) -1);
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test34");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        int int2 = mutableByte1.intValue();
        mutableByte1.add((java.lang.Number) (byte) 0);
        long long5 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test35");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 0.0d);
        mutableByte1.subtract((byte) 10);
        java.lang.Byte byte4 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -10 + "'", byte4.equals((byte) -10));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test36");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        float float3 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test37");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        java.lang.Byte byte2 = mutableByte1.toByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) byte2);
        long long4 = mutableByte3.longValue();
        mutableByte3.setValue((byte) 0);
        mutableByte3.add((byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test38");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str3 = mutableByte2.toString();
        mutableByte2.subtract((java.lang.Number) (byte) 1);
        java.lang.String str6 = mutableByte2.toString();
        java.lang.Byte byte7 = mutableByte2.toByte();
        mutableByte0.subtract((java.lang.Number) mutableByte2);
        java.lang.String str9 = mutableByte0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test39");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.setValue((java.lang.Number) 1);
        mutableByte1.increment();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test40");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.add((java.lang.Number) 100.0d);
        mutableByte1.increment();
        mutableByte1.increment();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test41");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.add((java.lang.Number) 100.0d);
        mutableByte1.decrement();
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test42");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.setValue((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        byte byte5 = mutableByte1.byteValue();
        java.lang.Byte byte6 = mutableByte1.toByte();
        java.lang.Byte byte7 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7.equals((byte) 100));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test43");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        java.lang.Byte byte2 = mutableByte1.toByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) byte2);
        mutableByte3.subtract((byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test44");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.setValue((byte) 1);
        int int3 = mutableByte0.intValue();
        mutableByte0.subtract((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test45");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        mutableByte1.setValue((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4.equals((byte) 100));
    }

    @Test
    public void MutableByte() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte0.test46");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str3 = mutableByte2.toString();
        mutableByte2.subtract((java.lang.Number) (byte) 1);
        java.lang.String str6 = mutableByte2.toString();
        java.lang.Byte byte7 = mutableByte2.toByte();
        mutableByte0.subtract((java.lang.Number) mutableByte2);
        mutableByte2.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7.equals((byte) 0));
    }
}

