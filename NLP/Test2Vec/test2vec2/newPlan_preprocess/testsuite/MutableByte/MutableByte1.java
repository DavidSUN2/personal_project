package MutableByte;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableByte1 {

    public static boolean debug = false;

    @Test
    public void MutableByte501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte501");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        mutableByte1.subtract((byte) 10);
        java.lang.Class<?> wildcardClass5 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableByte502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte502");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        byte byte3 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) -1);
        float float6 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
    }

    @Test
    public void MutableByte503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte503");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        mutableByte0.setValue((byte) -1);
        byte byte7 = mutableByte0.byteValue();
        double double8 = mutableByte0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void MutableByte504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte504");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        byte byte3 = mutableByte2.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 9 + "'", byte3 == (byte) 9);
    }

    @Test
    public void MutableByte505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte505");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.String str7 = mutableByte6.toString();
        mutableByte6.increment();
        java.lang.String str9 = mutableByte6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "11" + "'", str9.equals("11"));
    }

    @Test
    public void MutableByte506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte506");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        boolean boolean4 = mutableByte1.equals((java.lang.Object) (-1L));
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("2");
        byte byte7 = mutableByte6.byteValue();
        int int8 = mutableByte1.compareTo(mutableByte6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 2 + "'", byte7 == (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableByte507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte507");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        java.lang.String str6 = mutableByte1.toString();
        java.lang.String str7 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "10" + "'", str6.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableByte508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte508");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        java.lang.Byte byte2 = mutableByte1.toByte();
        mutableByte1.subtract((byte) 11);
        java.lang.Byte byte5 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5.equals((byte) -1));
    }

    @Test
    public void MutableByte509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte509");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        byte byte6 = mutableByte0.byteValue();
        double double7 = mutableByte0.doubleValue();
        mutableByte0.add((byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableByte510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte510");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte6.decrement();
        mutableByte6.setValue((byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableByte511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte511");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        mutableByte0.setValue((byte) -91);
        byte byte6 = mutableByte0.byteValue();
        mutableByte0.setValue((byte) -90);
        java.lang.Class<?> wildcardClass9 = mutableByte0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -91 + "'", byte6 == (byte) -91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte512");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        byte byte6 = mutableByte5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6 == (byte) 9);
    }

    @Test
    public void MutableByte513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte513");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        java.lang.Byte byte5 = mutableByte4.toByte();
        mutableByte4.setValue((byte) 0);
        boolean boolean8 = mutableByte1.equals((java.lang.Object) (byte) 0);
        int int9 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableByte514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte514");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        int int5 = mutableByte1.intValue();
        float float6 = mutableByte1.floatValue();
        java.lang.Byte byte7 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 11 + "'", byte4 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 11.0f + "'", float6 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7.equals((byte) 11));
    }

    @Test
    public void MutableByte515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte515");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        mutableByte1.subtract((byte) 1);
        mutableByte1.decrement();
        java.lang.Byte byte9 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 18 + "'", byte9.equals((byte) 18));
    }

    @Test
    public void MutableByte516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte516");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.subtract((byte) 0);
        float float3 = mutableByte0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void MutableByte517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte517");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        java.lang.String str6 = mutableByte1.toString();
        int int7 = mutableByte1.intValue();
        java.lang.Byte byte8 = mutableByte1.toByte();
        mutableByte1.increment();
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
    }

    @Test
    public void MutableByte518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte518");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        float float4 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 12.0f + "'", float4 == 12.0f);
    }

    @Test
    public void MutableByte519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte519");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        float float5 = mutableByte1.floatValue();
        mutableByte1.decrement();
        long long7 = mutableByte1.longValue();
        mutableByte1.subtract((byte) 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void MutableByte520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte520");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double2 = mutableByte1.doubleValue();
        short short3 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 11 + "'", short3 == (short) 11);
    }

    @Test
    public void MutableByte521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte521");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        java.lang.Byte byte6 = mutableByte1.getValue();
        java.lang.Byte byte7 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 9 + "'", byte7.equals((byte) 9));
    }

    @Test
    public void MutableByte522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte522");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str5 = mutableByte4.toString();
        java.lang.Byte byte6 = mutableByte4.getValue();
        mutableByte1.subtract((java.lang.Number) byte6);
        mutableByte1.setValue((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
    }

    @Test
    public void MutableByte523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte523");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        short short2 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void MutableByte524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte524");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        mutableByte1.subtract((byte) 1);
        long long8 = mutableByte1.longValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2L) + "'", long8 == (-2L));
    }

    @Test
    public void MutableByte525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte525");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        byte byte6 = mutableByte0.byteValue();
        double double7 = mutableByte0.doubleValue();
        byte byte8 = mutableByte0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableByte526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte526");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (-18));
    }

    @Test
    public void MutableByte527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte527");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte6.subtract((byte) 0);
        byte byte9 = mutableByte6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void MutableByte528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte528");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.Byte byte3 = mutableByte1.getValue();
        mutableByte1.add((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3.equals((byte) 10));
    }

    @Test
    public void MutableByte529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte529");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("-111");
        mutableByte1.subtract((byte) -90);
    }

    @Test
    public void MutableByte530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte530");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double2 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        int int4 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void MutableByte531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte531");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 100);
        double double2 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = null;
        // The following exception was thrown during execution in MutableByte generation
        try {
            int int4 = mutableByte1.compareTo(mutableByte3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void MutableByte532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte532");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        mutableByte1.decrement();
        int int6 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4.equals((byte) -91));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-92) + "'", int6 == (-92));
    }

    @Test
    public void MutableByte533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte533");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        mutableByte1.setValue((byte) 100);
        mutableByte1.setValue((byte) -1);
        int int6 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void MutableByte534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte534");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.subtract((byte) -1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte6);
        mutableByte6.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
    }

    @Test
    public void MutableByte535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte535");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.add((java.lang.Number) (short) 10);
        mutableByte1.setValue((byte) 9);
        int int8 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void MutableByte536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte536");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in MutableByte generation
        try {
            org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableByte537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte537");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 20);
        mutableByte1.increment();
        int int6 = mutableByte1.intValue();
        java.lang.Class<?> wildcardClass7 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-18) + "'", int6 == (-18));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableByte538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte538");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.increment();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void MutableByte539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte539");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) long3);
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) long3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void MutableByte540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte540");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        int int5 = mutableByte1.intValue();
        byte byte6 = mutableByte1.byteValue();
        java.lang.Byte byte7 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 11 + "'", byte4 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 11 + "'", byte6 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7.equals((byte) 11));
    }

    @Test
    public void MutableByte541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte541");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        mutableByte1.increment();
        mutableByte1.decrement();
        long long8 = mutableByte1.longValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void MutableByte542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte542");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.setValue((byte) 100);
        java.lang.String str4 = mutableByte0.toString();
        java.lang.Class<?> wildcardClass5 = mutableByte0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableByte543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte543");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        byte byte2 = mutableByte1.byteValue();
        mutableByte1.subtract((byte) 20);
        java.lang.Class<?> wildcardClass5 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableByte544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte544");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        java.lang.Byte byte6 = mutableByte1.getValue();
        float float7 = mutableByte1.floatValue();
        short short8 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 9 + "'", short8 == (short) 9);
    }

    @Test
    public void MutableByte545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte545");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        mutableByte0.subtract((byte) 0);
        mutableByte0.add((byte) 0);
        long long5 = mutableByte0.longValue();
        mutableByte0.setValue((byte) -91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableByte546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte546");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        mutableByte1.subtract((byte) -90);
    }

    @Test
    public void MutableByte547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte547");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("100");
        double double2 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void MutableByte548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte548");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        double double6 = mutableByte0.doubleValue();
        java.lang.Byte byte7 = mutableByte0.getValue();
        mutableByte0.setValue((byte) 10);
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
    }

    @Test
    public void MutableByte549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte549");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        byte byte5 = mutableByte1.byteValue();
        java.lang.Byte byte6 = mutableByte1.getValue();
        java.lang.Byte byte7 = mutableByte1.toByte();
        byte byte8 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 9 + "'", byte6.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 9 + "'", byte7.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 9 + "'", byte8 == (byte) 9);
    }

    @Test
    public void MutableByte550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte550");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte("19");
        int int5 = mutableByte1.compareTo(mutableByte4);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte4);
        mutableByte4.add((byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void MutableByte551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte551");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        mutableByte0.setValue((byte) -1);
        float float7 = mutableByte0.floatValue();
        float float8 = mutableByte0.floatValue();
        mutableByte0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void MutableByte552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte552");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.String str7 = mutableByte6.toString();
        double double8 = mutableByte6.doubleValue();
        java.lang.Class<?> wildcardClass9 = mutableByte6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte553");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.setValue((byte) 0);
        mutableByte1.subtract((java.lang.Number) (short) 1);
        java.lang.Class<?> wildcardClass6 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableByte554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte554");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 100);
        double double2 = mutableByte1.doubleValue();
        int int3 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void MutableByte555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte555");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        java.lang.Byte byte3 = mutableByte1.toByte();
        java.lang.Byte byte4 = mutableByte1.getValue();
        byte byte5 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableByte556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte556");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        double double3 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("2");
        java.lang.Class<?> wildcardClass6 = mutableByte5.getClass();
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte5);
        mutableByte5.add((byte) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte557");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 10L);
        java.lang.Byte byte2 = mutableByte1.getValue();
        byte byte3 = mutableByte1.byteValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void MutableByte558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte558");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.subtract((byte) 0);
        int int4 = mutableByte1.intValue();
        java.lang.Byte byte5 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5.equals((byte) 10));
    }

    @Test
    public void MutableByte559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte559");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 8);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str4 = mutableByte3.toString();
        byte byte5 = mutableByte3.byteValue();
        byte byte6 = mutableByte3.byteValue();
        boolean boolean7 = mutableByte1.equals((java.lang.Object) byte6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte560");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        float float4 = mutableByte1.floatValue();
        double double5 = mutableByte1.doubleValue();
        mutableByte1.subtract((java.lang.Number) (byte) 9);
        mutableByte1.subtract((byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
    }

    @Test
    public void MutableByte561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte561");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        long long2 = mutableByte1.longValue();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        float float5 = mutableByte4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void MutableByte562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte562");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        mutableByte1.add((byte) 0);
        byte byte5 = mutableByte1.byteValue();
        mutableByte1.add((byte) 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableByte563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte563");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        int int5 = mutableByte1.intValue();
        double double6 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void MutableByte564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte564");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.setValue((byte) 9);
        java.lang.Byte byte4 = mutableByte1.getValue();
        mutableByte1.setValue((byte) -1);
        double double7 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 9 + "'", byte4.equals((byte) 9));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void MutableByte565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte565");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        float float5 = mutableByte0.floatValue();
        double double6 = mutableByte0.doubleValue();
        java.lang.Byte byte7 = mutableByte0.getValue();
        float float8 = mutableByte0.floatValue();
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
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7.equals((byte) 0));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte566");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        java.lang.String str5 = mutableByte1.toString();
        float float6 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void MutableByte567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte567");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.decrement();
        byte byte5 = mutableByte1.byteValue();
        mutableByte1.add((byte) 99);
        double double8 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 99.0d + "'", double8 == 99.0d);
    }

    @Test
    public void MutableByte568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte568");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        mutableByte1.decrement();
        mutableByte1.subtract((byte) 0);
        byte byte7 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 9 + "'", byte7 == (byte) 9);
    }

    @Test
    public void MutableByte569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte569");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
    }

    @Test
    public void MutableByte570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte570");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        mutableByte1.increment();
        java.lang.Byte byte4 = mutableByte1.getValue();
        java.lang.String str5 = mutableByte1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 2 + "'", byte4.equals((byte) 2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2" + "'", str5.equals("2"));
    }

    @Test
    public void MutableByte571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte571");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        mutableByte0.setValue((byte) -1);
        long long7 = mutableByte0.longValue();
        mutableByte0.setValue((java.lang.Number) (byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void MutableByte572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte572");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double6 = mutableByte5.doubleValue();
        mutableByte1.setValue((java.lang.Number) double6);
        double double8 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 11.0d + "'", double8 == 11.0d);
    }

    @Test
    public void MutableByte573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte573");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) (short) -1);
        java.lang.Byte byte2 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2.equals((byte) -1));
    }

    @Test
    public void MutableByte574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte574");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        mutableByte1.subtract((java.lang.Number) 0.0f);
        mutableByte1.decrement();
        mutableByte1.subtract((byte) 0);
        short short7 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 9 + "'", short7 == (short) 9);
    }

    @Test
    public void MutableByte575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte575");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.increment();
        double double4 = mutableByte1.doubleValue();
        short short5 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 11.0d + "'", double4 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 11 + "'", short5 == (short) 11);
    }

    @Test
    public void MutableByte576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte576");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte("11");
        double double6 = mutableByte5.doubleValue();
        mutableByte1.setValue((java.lang.Number) double6);
        org.apache.commons.lang3.mutable.MutableByte mutableByte8 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        short short9 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 11.0d + "'", double6 == 11.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 11 + "'", short9 == (short) 11);
    }

    @Test
    public void MutableByte577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte577");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.increment();
        long long5 = mutableByte1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
    }

    @Test
    public void MutableByte578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte578");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100L);
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100L);
        mutableByte2.add((byte) 0);
        java.lang.Byte byte5 = mutableByte2.getValue();
        byte byte6 = mutableByte2.byteValue();
        mutableByte2.add((byte) 0);
        mutableByte2.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5.equals((byte) 100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void MutableByte579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte579");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.add((byte) 99);
        mutableByte1.subtract((java.lang.Number) 1);
        byte byte9 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 106 + "'", byte9 == (byte) 106);
    }

    @Test
    public void MutableByte580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte580");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte3.increment();
        long long5 = mutableByte3.longValue();
        int int6 = mutableByte1.compareTo(mutableByte3);
        long long7 = mutableByte3.longValue();
        mutableByte3.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11L + "'", long7 == 11L);
    }

    @Test
    public void MutableByte581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte581");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        long long4 = mutableByte1.longValue();
        double double5 = mutableByte1.doubleValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11L + "'", long4 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 11.0d + "'", double5 == 11.0d);
    }

    @Test
    public void MutableByte582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte582");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.subtract((java.lang.Number) 10L);
        mutableByte1.setValue((java.lang.Number) 100.0d);
        mutableByte1.subtract((byte) 9);
    }

    @Test
    public void MutableByte583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte583");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("1");
        byte byte2 = mutableByte1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void MutableByte584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte584");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean3 = mutableByte1.equals((java.lang.Object) 10L);
        float float4 = mutableByte1.floatValue();
        float float5 = mutableByte1.floatValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) float5);
        mutableByte6.subtract((java.lang.Number) (-91));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 11.0f + "'", float5 == 11.0f);
    }

    @Test
    public void MutableByte585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte585");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        java.lang.Byte byte5 = mutableByte1.getValue();
        int int6 = mutableByte1.intValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 11 + "'", byte4 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 11 + "'", byte5.equals((byte) 11));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void MutableByte586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte586");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte4.setValue((byte) 1);
        short short7 = mutableByte4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void MutableByte587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte587");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        java.lang.String str3 = mutableByte1.toString();
        double double4 = mutableByte1.doubleValue();
        int int5 = mutableByte1.intValue();
        mutableByte1.setValue((byte) 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableByte588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte588");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte("19");
        int int5 = mutableByte1.compareTo(mutableByte4);
        boolean boolean7 = mutableByte1.equals((java.lang.Object) (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte589");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("8");
        java.lang.Byte byte2 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 8 + "'", byte2.equals((byte) 8));
    }

    @Test
    public void MutableByte590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte590");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        java.lang.Byte byte2 = mutableByte1.getValue();
        mutableByte1.decrement();
        java.lang.Byte byte4 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 2 + "'", byte2.equals((byte) 2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4.equals((byte) 1));
    }

    @Test
    public void MutableByte591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte591");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        mutableByte0.setValue((byte) -1);
        float float7 = mutableByte0.floatValue();
        int int8 = mutableByte0.intValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte9 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte0);
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
    public void MutableByte592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte592");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte4 = mutableByte3.toByte();
        org.apache.commons.lang3.mutable.MutableByte mutableByte5 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4.equals((byte) 10));
    }

    @Test
    public void MutableByte593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte593");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte2 = mutableByte1.getValue();
        double double3 = mutableByte1.doubleValue();
        mutableByte1.increment();
        mutableByte1.increment();
        float float6 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 3.0f + "'", float6 == 3.0f);
    }

    @Test
    public void MutableByte594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte594");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        int int4 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-91) + "'", int4 == (-91));
    }

    @Test
    public void MutableByte595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte595");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.increment();
        float float4 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 11.0f + "'", float4 == 11.0f);
    }

    @Test
    public void MutableByte596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte596");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("-91");
        org.apache.commons.lang3.mutable.MutableByte mutableByte2 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        byte byte3 = mutableByte1.byteValue();
        mutableByte1.setValue((byte) -8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -91 + "'", byte3 == (byte) -91);
    }

    @Test
    public void MutableByte597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte597");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        mutableByte1.increment();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte598");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 2);
        mutableByte1.subtract((byte) 0);
        int int4 = mutableByte1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void MutableByte599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte599");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        java.lang.Byte byte5 = mutableByte4.toByte();
        mutableByte4.setValue((byte) 0);
        boolean boolean8 = mutableByte1.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte600");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((byte) 1);
        java.lang.Byte byte5 = mutableByte4.getValue();
        double double6 = mutableByte4.doubleValue();
        mutableByte4.increment();
        int int8 = mutableByte1.compareTo(mutableByte4);
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5.equals((byte) 1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 11 + "'", byte9.equals((byte) 11));
    }

    @Test
    public void MutableByte601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte601");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        byte byte6 = mutableByte1.byteValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte7 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Class<?> wildcardClass8 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6 == (byte) 20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableByte602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte602");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        mutableByte1.increment();
        java.lang.Byte byte6 = mutableByte1.toByte();
        int int7 = mutableByte1.intValue();
        short short8 = mutableByte1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }

    @Test
    public void MutableByte603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte603");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.add((byte) 9);
        byte byte6 = mutableByte1.byteValue();
        mutableByte1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 20 + "'", byte6 == (byte) 20);
    }

    @Test
    public void MutableByte604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte604");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte5 = mutableByte1.toByte();
        double double6 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 8 + "'", byte5.equals((byte) 8));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
    }

    @Test
    public void MutableByte605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte605");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("10");
        java.lang.String str2 = mutableByte1.toString();
        java.lang.Byte byte3 = mutableByte1.getValue();
        double double4 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "10" + "'", str2.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3.equals((byte) 10));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableByte606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte606");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        mutableByte1.setValue((byte) 10);
        double double5 = mutableByte1.doubleValue();
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        float float7 = mutableByte6.floatValue();
        mutableByte6.setValue((byte) -2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void MutableByte607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte607");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        double double2 = mutableByte1.doubleValue();
        mutableByte1.decrement();
        mutableByte1.increment();
        mutableByte1.setValue((byte) 9);
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableByte608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte608");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        long long2 = mutableByte1.longValue();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte((byte) 11);
        mutableByte6.add((byte) -90);
        boolean boolean9 = mutableByte4.equals((java.lang.Object) (byte) -90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "10" + "'", str3.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableByte609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte609");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        java.lang.Byte byte5 = mutableByte4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 8 + "'", byte5.equals((byte) 8));
    }

    @Test
    public void MutableByte610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte610");
        org.apache.commons.lang3.mutable.MutableByte mutableByte0 = new org.apache.commons.lang3.mutable.MutableByte();
        float float1 = mutableByte0.floatValue();
        mutableByte0.add((byte) 0);
        java.lang.String str4 = mutableByte0.toString();
        java.lang.String str5 = mutableByte0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableByte611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte611");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        mutableByte1.add((java.lang.Number) 8.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableByte612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte612");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("2");
        mutableByte1.add((byte) 20);
        double double4 = mutableByte1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 22.0d + "'", double4 == 22.0d);
    }

    @Test
    public void MutableByte613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte613");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) -92);
    }

    @Test
    public void MutableByte614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte614");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        mutableByte1.subtract((byte) 100);
        java.lang.Byte byte4 = mutableByte1.toByte();
        double double5 = mutableByte1.doubleValue();
        java.lang.Byte byte6 = mutableByte1.getValue();
        mutableByte1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -91 + "'", byte4.equals((byte) -91));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-91.0d) + "'", double5 == (-91.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -91 + "'", byte6.equals((byte) -91));
    }

    @Test
    public void MutableByte615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte615");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        byte byte4 = mutableByte1.byteValue();
        int int5 = mutableByte1.intValue();
        java.lang.String str6 = mutableByte1.toString();
        java.lang.Byte byte7 = mutableByte1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 11 + "'", byte4 == (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "11" + "'", str6.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 11 + "'", byte7.equals((byte) 11));
    }

    @Test
    public void MutableByte616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte616");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 9);
        org.apache.commons.lang3.mutable.MutableByte mutableByte3 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 100);
        boolean boolean4 = mutableByte1.equals((java.lang.Object) 100);
        org.apache.commons.lang3.mutable.MutableByte mutableByte6 = new org.apache.commons.lang3.mutable.MutableByte("11");
        boolean boolean7 = mutableByte1.equals((java.lang.Object) mutableByte6);
        mutableByte1.increment();
        java.lang.Class<?> wildcardClass9 = mutableByte1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableByte617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte617");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableByte1.toString();
        java.lang.Byte byte3 = mutableByte1.toByte();
        mutableByte1.add((byte) 21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3.equals((byte) 1));
    }

    @Test
    public void MutableByte618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte618");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        long long3 = mutableByte1.longValue();
        mutableByte1.increment();
        mutableByte1.setValue((byte) -79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void MutableByte619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte619");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte((byte) 10);
        mutableByte1.increment();
        java.lang.String str3 = mutableByte1.toString();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        float float5 = mutableByte1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "11" + "'", str3.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 11.0f + "'", float5 == 11.0f);
    }

    @Test
    public void MutableByte620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableByte1.MutableByte620");
        org.apache.commons.lang3.mutable.MutableByte mutableByte1 = new org.apache.commons.lang3.mutable.MutableByte("9");
        long long2 = mutableByte1.longValue();
        mutableByte1.decrement();
        org.apache.commons.lang3.mutable.MutableByte mutableByte4 = new org.apache.commons.lang3.mutable.MutableByte((java.lang.Number) mutableByte1);
        mutableByte1.add((byte) 99);
        mutableByte1.subtract((java.lang.Number) 1);
        java.lang.Byte byte9 = mutableByte1.toByte();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 106 + "'", byte9.equals((byte) 106));
    }
}

