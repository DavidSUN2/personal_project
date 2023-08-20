package MutableLong;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableLong1 {

    public static boolean debug = false;

    @Test
    public void MutableLong501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong501");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.add((long) (short) -1);
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        int int8 = mutableLong7.intValue();
        int int9 = mutableLong1.compareTo(mutableLong7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableLong502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong502");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 0);
        java.lang.String str7 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableLong503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong503");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.decrement();
        java.lang.Long long3 = mutableLong0.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long5 = mutableLong4.getValue();
        mutableLong4.add((java.lang.Number) (-99.0d));
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        mutableLong4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3.equals((-2L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
    }

    @Test
    public void MutableLong504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong504");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        int int5 = mutableLong1.compareTo(mutableLong4);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableLong505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong505");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong506");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        java.lang.Long long5 = mutableLong1.getValue();
        mutableLong1.decrement();
        int int7 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void MutableLong507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong507");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        int int2 = mutableLong1.intValue();
        float float3 = mutableLong1.floatValue();
        mutableLong1.increment();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "11" + "'", str5.equals("11"));
    }

    @Test
    public void MutableLong508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong508");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.add((long) (byte) -57);
        int int5 = mutableLong1.intValue();
        mutableLong1.add((long) (-47));
        java.lang.Long long8 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-47) + "'", int5 == (-47));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-94L) + "'", long8.equals((-94L)));
    }

    @Test
    public void MutableLong509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong509");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        mutableLong1.increment();
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong1.subtract(number5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong510");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        mutableLong0.add((long) (short) 10);
        mutableLong0.add((long) 19);
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.Long long8 = mutableLong0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 30L + "'", long8.equals(30L));
    }

    @Test
    public void MutableLong511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong511");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.subtract(0L);
    }

    @Test
    public void MutableLong512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong512");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong3.add((java.lang.Number) 10);
        mutableLong3.decrement();
        java.lang.Long long7 = mutableLong3.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong3);
        mutableLong8.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8L + "'", long7.equals(8L));
    }

    @Test
    public void MutableLong513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong513");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        double double3 = mutableLong1.doubleValue();
        short short4 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
    }

    @Test
    public void MutableLong514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong514");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        long long5 = mutableLong1.longValue();
        int int6 = mutableLong1.intValue();
        java.lang.Long long7 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
    }

    @Test
    public void MutableLong515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong515");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        mutableLong1.subtract((long) '4');
        double double9 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-52.0d) + "'", double9 == (-52.0d));
    }

    @Test
    public void MutableLong516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong516");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        long long1 = mutableLong0.longValue();
        mutableLong0.setValue((java.lang.Number) 100.0f);
        mutableLong0.decrement();
        short short5 = mutableLong0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 99 + "'", short5 == (short) 99);
    }

    @Test
    public void MutableLong517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong517");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        long long6 = mutableLong0.longValue();
        java.lang.String str7 = mutableLong0.toString();
        byte byte8 = mutableLong0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "100" + "'", str7.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void MutableLong518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong518");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        int int2 = mutableLong1.intValue();
        float float3 = mutableLong1.floatValue();
        java.lang.Class<?> wildcardClass4 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableLong519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong519");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        long long5 = mutableLong1.longValue();
        int int6 = mutableLong1.intValue();
        mutableLong1.decrement();
        long long8 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void MutableLong520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong520");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-2.0d));
        long long2 = mutableLong1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong521");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        java.lang.Long long4 = mutableLong0.getValue();
        java.lang.Long long5 = mutableLong0.getValue();
        java.lang.Class<?> wildcardClass6 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4.equals((-99L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-99L) + "'", long5.equals((-99L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong522");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        int int4 = mutableLong0.intValue();
        mutableLong0.subtract((-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99) + "'", int4 == (-99));
    }

    @Test
    public void MutableLong523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong523");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) -1);
        mutableLong1.setValue(0L);
    }

    @Test
    public void MutableLong524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong524");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 10);
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        java.lang.String str4 = mutableLong3.toString();
        java.lang.Long long5 = mutableLong3.getValue();
        java.lang.Long long6 = mutableLong3.toLong();
        mutableLong1.setValue((java.lang.Number) long6);
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6.equals(100L));
    }

    @Test
    public void MutableLong525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong525");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        boolean boolean7 = mutableLong1.equals((java.lang.Object) 100L);
        java.lang.String str8 = mutableLong1.toString();
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void MutableLong526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong526");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        long long4 = mutableLong3.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong("35");
        boolean boolean7 = mutableLong3.equals((java.lang.Object) mutableLong6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableLong527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong527");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        java.lang.Long long5 = mutableLong4.toLong();
        mutableLong1.add((java.lang.Number) mutableLong4);
        long long7 = mutableLong4.longValue();
        java.lang.Class<?> wildcardClass8 = mutableLong4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableLong528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong528");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.increment();
        mutableLong1.subtract((long) '4');
        java.lang.String str6 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-41" + "'", str6.equals("-41"));
    }

    @Test
    public void MutableLong529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong529");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong2.decrement();
        int int4 = mutableLong2.intValue();
        mutableLong1.setValue((java.lang.Number) mutableLong2);
        double double6 = mutableLong1.doubleValue();
        float float7 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) float7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void MutableLong530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong530");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.decrement();
        java.lang.Long long3 = mutableLong0.getValue();
        java.lang.String str4 = mutableLong0.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong(56L);
        mutableLong0.setValue((java.lang.Number) 56L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3.equals((-2L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-2" + "'", str4.equals("-2"));
    }

    @Test
    public void MutableLong531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong531");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -1);
    }

    @Test
    public void MutableLong532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong532");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        java.lang.Long long6 = mutableLong1.getValue();
        double double7 = mutableLong1.doubleValue();
        byte byte8 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void MutableLong533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong533");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 98);
    }

    @Test
    public void MutableLong534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong534");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 0);
        mutableLong1.increment();
        mutableLong1.add((long) (short) -1);
    }

    @Test
    public void MutableLong535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong535");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        int int2 = mutableLong1.intValue();
        java.lang.Long long3 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3.equals(100L));
    }

    @Test
    public void MutableLong536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong536");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        float float2 = mutableLong0.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong4.add((java.lang.Number) (byte) 1);
        mutableLong4.decrement();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void MutableLong537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong537");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(20L);
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long4 = mutableLong3.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong3);
        long long6 = mutableLong5.longValue();
        float float7 = mutableLong5.floatValue();
        java.lang.Long long8 = mutableLong5.getValue();
        mutableLong1.add((java.lang.Number) mutableLong5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
    }

    @Test
    public void MutableLong538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong538");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((long) 19);
        java.lang.Long long5 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-20L) + "'", long5.equals((-20L)));
    }

    @Test
    public void MutableLong539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong539");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        mutableLong0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableLong540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong540");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        double double4 = mutableLong1.doubleValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) double4);
        mutableLong5.add((-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void MutableLong541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong541");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        java.lang.Long long5 = mutableLong1.getValue();
        double double6 = mutableLong1.doubleValue();
        double double7 = mutableLong1.doubleValue();
        java.lang.Object obj8 = null;
        boolean boolean9 = mutableLong1.equals(obj8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableLong542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong542");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (-1));
        java.lang.Long long2 = mutableLong1.toLong();
        mutableLong1.subtract((long) (short) -21);
        long long5 = mutableLong1.longValue();
        mutableLong1.subtract(56L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 20L + "'", long5 == 20L);
    }

    @Test
    public void MutableLong543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong543");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong1.add(100L);
    }

    @Test
    public void MutableLong544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong544");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -99);
        mutableLong1.decrement();
        double double3 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
    }

    @Test
    public void MutableLong545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong545");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        java.lang.Long long5 = mutableLong1.toLong();
        java.lang.Long long6 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6.equals(1L));
    }

    @Test
    public void MutableLong546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong546");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.decrement();
        float float3 = mutableLong0.floatValue();
        java.lang.Long long4 = mutableLong0.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4.equals((-1L)));
    }

    @Test
    public void MutableLong547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong547");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.add((java.lang.Number) (-1L));
        java.lang.String str6 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "19" + "'", str6.equals("19"));
    }

    @Test
    public void MutableLong548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong548");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        mutableLong1.subtract((long) (byte) -57);
        long long5 = mutableLong1.longValue();
        double double6 = mutableLong1.doubleValue();
        mutableLong1.increment();
        java.lang.Long long8 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 56L + "'", long5 == 56L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 56.0d + "'", double6 == 56.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 57L + "'", long8.equals(57L));
    }

    @Test
    public void MutableLong549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong549");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("9");
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2.equals(9L));
    }

    @Test
    public void MutableLong550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong550");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        mutableLong1.subtract((java.lang.Number) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
    }

    @Test
    public void MutableLong551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong551");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.add((long) (short) -1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) (-2));
        mutableLong1.setValue((java.lang.Number) mutableLong6);
        mutableLong1.decrement();
        long long9 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3L) + "'", long9 == (-3L));
    }

    @Test
    public void MutableLong552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong552");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        mutableLong1.subtract((long) (byte) -57);
        java.lang.Long long5 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 56L + "'", long5.equals(56L));
    }

    @Test
    public void MutableLong553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong553");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        java.lang.Long long4 = mutableLong1.getValue();
        java.lang.Class<?> wildcardClass5 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong554");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        mutableLong1.add(0L);
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong555");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-52.0d));
    }

    @Test
    public void MutableLong556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong556");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-100L));
        int int3 = mutableLong2.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        long long5 = mutableLong4.longValue();
        mutableLong2.add((java.lang.Number) mutableLong4);
        mutableLong2.subtract((long) (short) -10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void MutableLong557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong557");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("19");
    }

    @Test
    public void MutableLong558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong558");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.increment();
        mutableLong0.setValue((long) 0);
        java.lang.Class<?> wildcardClass7 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong559");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) 19);
        mutableLong2.subtract((java.lang.Number) mutableLong4);
    }

    @Test
    public void MutableLong560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong560");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long5 = mutableLong4.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double8 = mutableLong0.doubleValue();
        long long9 = mutableLong0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableLong561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong561");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        mutableLong1.increment();
        mutableLong1.increment();
        mutableLong1.add(0L);
    }

    @Test
    public void MutableLong562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong562");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        java.lang.Long long8 = mutableLong1.toLong();
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8.equals((-99L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -99 + "'", short9 == (short) -99);
    }

    @Test
    public void MutableLong563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong563");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        java.lang.Long long8 = mutableLong3.toLong();
        java.lang.Long long9 = mutableLong3.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void MutableLong564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong564");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 9);
        mutableLong1.add((-2L));
        mutableLong1.increment();
    }

    @Test
    public void MutableLong565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong565");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.decrement();
        java.lang.Long long3 = mutableLong0.getValue();
        int int4 = mutableLong0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3.equals((-2L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2) + "'", int4 == (-2));
    }

    @Test
    public void MutableLong566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong566");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) -1);
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void MutableLong567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong567");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableLong3.equals(obj4);
        java.lang.Long long6 = mutableLong3.getValue();
        mutableLong3.setValue((long) 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
    }

    @Test
    public void MutableLong568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong568");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong569");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 10);
        double double2 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableLong570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong570");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        boolean boolean3 = mutableLong0.equals((java.lang.Object) (-99.0f));
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((long) 0);
        mutableLong5.add(18L);
        int int8 = mutableLong0.compareTo(mutableLong5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableLong571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong571");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(3L);
        java.lang.String str2 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3" + "'", str2.equals("3"));
    }

    @Test
    public void MutableLong572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong572");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) 100);
        java.lang.Long long3 = mutableLong2.getValue();
        int int4 = mutableLong2.intValue();
        mutableLong2.subtract((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void MutableLong573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong573");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        long long2 = mutableLong1.longValue();
        long long3 = mutableLong1.longValue();
        mutableLong1.increment();
        int int5 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableLong574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong574");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        float float4 = mutableLong0.floatValue();
        mutableLong0.increment();
        double double6 = mutableLong0.doubleValue();
        long long7 = mutableLong0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-99.0f) + "'", float4 == (-99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-98.0d) + "'", double6 == (-98.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-98L) + "'", long7 == (-98L));
    }

    @Test
    public void MutableLong575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong575");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long4 = mutableLong3.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong3);
        double double6 = mutableLong5.doubleValue();
        java.lang.Long long7 = mutableLong5.getValue();
        mutableLong1.subtract((java.lang.Number) mutableLong5);
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
    }

    @Test
    public void MutableLong576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong576");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 10);
        mutableLong1.setValue((long) 3);
        mutableLong1.decrement();
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong577");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        mutableLong0.add((long) (short) 10);
        mutableLong0.add((long) 19);
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.String str8 = mutableLong7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "30" + "'", str8.equals("30"));
    }

    @Test
    public void MutableLong578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong578");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        int int4 = mutableLong0.intValue();
        float float5 = mutableLong0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99) + "'", int4 == (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-99.0f) + "'", float5 == (-99.0f));
    }

    @Test
    public void MutableLong579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong579");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -99);
        boolean boolean8 = mutableLong1.equals((java.lang.Object) mutableLong7);
        float float9 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableLong580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong580");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((long) (byte) 2);
        mutableLong1.setValue((long) (byte) -97);
    }

    @Test
    public void MutableLong581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong581");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-100");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        int int7 = mutableLong3.intValue();
        mutableLong1.subtract((java.lang.Number) mutableLong3);
        byte byte9 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -101 + "'", byte9 == (byte) -101);
    }

    @Test
    public void MutableLong582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong582");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.subtract((long) (short) 10);
        double double8 = mutableLong1.doubleValue();
        float float9 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-10.0f) + "'", float9 == (-10.0f));
    }

    @Test
    public void MutableLong583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong583");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        double double7 = mutableLong1.doubleValue();
        mutableLong1.increment();
        java.lang.String str9 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void MutableLong584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong584");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        mutableLong1.setValue((-1L));
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9.equals((-1L)));
    }

    @Test
    public void MutableLong585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong585");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        mutableLong0.add((long) (short) 10);
        mutableLong0.add((long) 19);
        mutableLong0.add((long) (short) 11);
        java.lang.Class<?> wildcardClass9 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong586");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.setValue(98L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong587");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        java.lang.Long long3 = mutableLong1.toLong();
        java.lang.Class<?> wildcardClass4 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableLong588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong588");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-98.0f));
    }

    @Test
    public void MutableLong589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong589");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        mutableLong0.add((long) (short) 10);
        mutableLong0.add((long) 19);
        mutableLong0.add((long) (short) 11);
        double double9 = mutableLong0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 41.0d + "'", double9 == 41.0d);
    }

    @Test
    public void MutableLong590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong590");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        double double3 = mutableLong1.doubleValue();
        int int4 = mutableLong1.intValue();
        mutableLong1.add((long) (byte) -57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void MutableLong591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong591");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -99);
        boolean boolean8 = mutableLong1.equals((java.lang.Object) mutableLong7);
        java.lang.Long long9 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void MutableLong592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong592");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        mutableLong1.increment();
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
    }

    @Test
    public void MutableLong593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong593");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableLong594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong594");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong6);
        int int8 = mutableLong1.compareTo(mutableLong7);
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableLong595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong595");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        mutableLong1.increment();
        mutableLong1.subtract(35L);
        boolean boolean8 = mutableLong1.equals((java.lang.Object) 30L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableLong596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong596");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-197");
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -197 + "'", short2 == (short) -197);
    }

    @Test
    public void MutableLong597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong597");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        java.lang.Long long5 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.add((java.lang.Number) mutableLong6);
        short short8 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableLong598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong598");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        java.lang.String str8 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void MutableLong599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong599");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        double double4 = mutableLong0.doubleValue();
        float float5 = mutableLong0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
    }

    @Test
    public void MutableLong600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong600");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        int int2 = mutableLong0.intValue();
        java.lang.String str3 = mutableLong0.toString();
        java.lang.Long long4 = mutableLong0.getValue();
        mutableLong0.subtract((java.lang.Number) (-36L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1" + "'", str3.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4.equals((-1L)));
    }

    @Test
    public void MutableLong601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong601");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        double double8 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void MutableLong602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong602");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        mutableLong1.add(18L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void MutableLong603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong603");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-47");
        double double2 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-47.0d) + "'", double2 == (-47.0d));
    }

    @Test
    public void MutableLong604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong604");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        long long1 = mutableLong0.longValue();
        long long2 = mutableLong0.longValue();
        java.lang.String str3 = mutableLong0.toString();
        mutableLong0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableLong605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong605");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.decrement();
        java.lang.Long long3 = mutableLong0.getValue();
        mutableLong0.subtract((-2L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 2);
        boolean boolean8 = mutableLong0.equals((java.lang.Object) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3.equals((-2L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableLong606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong606");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        mutableLong1.add((long) (-1));
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong607");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (short) 98);
        mutableLong1.add(35L);
    }

    @Test
    public void MutableLong608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong608");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        mutableLong0.add((long) (short) 10);
        float float5 = mutableLong0.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) float5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 11.0f + "'", float5 == 11.0f);
    }

    @Test
    public void MutableLong609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong609");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        mutableLong0.increment();
        float float5 = mutableLong0.floatValue();
        mutableLong0.decrement();
        mutableLong0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-98.0f) + "'", float5 == (-98.0f));
    }

    @Test
    public void MutableLong610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong610");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        java.lang.Long long5 = mutableLong1.getValue();
        java.lang.Long long6 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
    }

    @Test
    public void MutableLong611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong611");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (-1));
        mutableLong1.setValue((java.lang.Number) (-10L));
        long long4 = mutableLong1.longValue();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-10L) + "'", long4 == (-10L));
    }

    @Test
    public void MutableLong612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong612");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 1);
        float float7 = mutableLong1.floatValue();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong1.subtract(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
    }

    @Test
    public void MutableLong613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong613");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        int int2 = mutableLong0.intValue();
        float float3 = mutableLong0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void MutableLong614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong614");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        long long3 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long6 = mutableLong5.longValue();
        mutableLong1.setValue((java.lang.Number) long6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void MutableLong615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong615");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        boolean boolean6 = mutableLong1.equals((java.lang.Object) (short) 1);
        double double7 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableLong616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong616");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 18);
    }

    @Test
    public void MutableLong617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong617");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableLong3.equals(obj4);
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong3.setValue(number6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong618");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        long long7 = mutableLong1.longValue();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void MutableLong619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong619");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 10);
        double double2 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void MutableLong620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong620");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        int int4 = mutableLong0.intValue();
        java.lang.String str5 = mutableLong0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99) + "'", int4 == (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-99" + "'", str5.equals("-99"));
    }

    @Test
    public void MutableLong621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong621");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.setValue((java.lang.Number) 100.0d);
        mutableLong1.setValue((long) (short) -41);
    }

    @Test
    public void MutableLong622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong622");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableLong3.equals(obj4);
        double double6 = mutableLong3.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void MutableLong623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong623");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.decrement();
        java.lang.Long long3 = mutableLong0.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3.equals((-2L)));
    }

    @Test
    public void MutableLong624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong624");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long4 = mutableLong3.getValue();
        java.lang.String str5 = mutableLong3.toString();
        byte byte6 = mutableLong3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableLong625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong625");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long4 = mutableLong3.getValue();
        mutableLong3.decrement();
        java.lang.Long long6 = mutableLong3.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
    }

    @Test
    public void MutableLong626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong626");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        byte byte6 = mutableLong5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void MutableLong627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong627");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        mutableLong1.subtract((long) 3);
        java.lang.Long long4 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-4L) + "'", long4.equals((-4L)));
    }

    @Test
    public void MutableLong628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong628");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.Long long5 = mutableLong4.getValue();
        int int6 = mutableLong4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void MutableLong629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong629");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-99L));
        long long2 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-99L) + "'", long2 == (-99L));
    }

    @Test
    public void MutableLong630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong630");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((java.lang.Number) 10.0f);
        float float5 = mutableLong1.floatValue();
        mutableLong1.increment();
        mutableLong1.add((long) 'a');
        long long9 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 98L + "'", long9 == 98L);
    }

    @Test
    public void MutableLong631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong631");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        java.lang.Long long5 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str7 = mutableLong6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
    }

    @Test
    public void MutableLong632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong632");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '4');
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 52 + "'", short2 == (short) 52);
    }

    @Test
    public void MutableLong633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong633");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        java.lang.Long long7 = mutableLong1.getValue();
        java.lang.Long long8 = mutableLong1.getValue();
        java.lang.Long long9 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void MutableLong634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong634");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long5 = mutableLong4.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.String str8 = mutableLong4.toString();
        double double9 = mutableLong4.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void MutableLong635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong635");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        int int8 = mutableLong7.intValue();
        mutableLong7.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableLong636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong636");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 10);
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        java.lang.String str4 = mutableLong3.toString();
        java.lang.Long long5 = mutableLong3.getValue();
        java.lang.Long long6 = mutableLong3.toLong();
        mutableLong1.setValue((java.lang.Number) long6);
        float float8 = mutableLong1.floatValue();
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void MutableLong637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong637");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.Long long5 = mutableLong4.getValue();
        mutableLong4.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5.equals(100L));
    }

    @Test
    public void MutableLong638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong638");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 57L);
    }

    @Test
    public void MutableLong639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong639");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.decrement();
        java.lang.String str7 = mutableLong1.toString();
        mutableLong1.increment();
        double double9 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-2" + "'", str7.equals("-2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void MutableLong640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong640");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((long) (-1));
        java.lang.Long long8 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
    }

    @Test
    public void MutableLong641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong641");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) long2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void MutableLong642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong642");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 1);
        mutableLong1.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong4.subtract((long) ' ');
    }

    @Test
    public void MutableLong643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong643");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(30L);
    }

    @Test
    public void MutableLong644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong644");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        float float5 = mutableLong1.floatValue();
        long long6 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void MutableLong645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong645");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        long long4 = mutableLong1.longValue();
        mutableLong1.subtract((long) (-47));
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong1.setValue(number7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void MutableLong646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong646");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        int int2 = mutableLong1.intValue();
        float float3 = mutableLong1.floatValue();
        mutableLong1.increment();
        mutableLong1.subtract((-9L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void MutableLong647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong647");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (short) 98);
        double double4 = mutableLong1.doubleValue();
        mutableLong1.subtract((java.lang.Number) 100.0d);
        double double7 = mutableLong1.doubleValue();
        mutableLong1.subtract((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-97.0d) + "'", double4 == (-97.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-197.0d) + "'", double7 == (-197.0d));
    }

    @Test
    public void MutableLong648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong648");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 9);
        mutableLong1.add((-2L));
        mutableLong1.decrement();
        float float5 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 6.0f + "'", float5 == 6.0f);
    }

    @Test
    public void MutableLong649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong649");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        long long6 = mutableLong5.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            int int8 = mutableLong5.compareTo(mutableLong7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void MutableLong650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong650");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("100");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
    }

    @Test
    public void MutableLong651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong651");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 100);
        float float2 = mutableLong1.floatValue();
        float float3 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void MutableLong652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong652");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        int int4 = mutableLong1.intValue();
        short short5 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void MutableLong653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong653");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.Long long5 = mutableLong4.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5.equals(100L));
    }

    @Test
    public void MutableLong654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong654");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        mutableLong0.add((long) (short) 10);
        float float5 = mutableLong0.floatValue();
        java.lang.Class<?> wildcardClass6 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 11.0f + "'", float5 == 11.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong655");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        int int2 = mutableLong0.intValue();
        mutableLong0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void MutableLong656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong656");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.add((long) 19);
        mutableLong1.subtract((long) (short) 111);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong657");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        int int4 = mutableLong0.intValue();
        mutableLong0.add(0L);
        long long7 = mutableLong0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99) + "'", int4 == (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-99L) + "'", long7 == (-99L));
    }

    @Test
    public void MutableLong658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong658");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((java.lang.Number) 10.0f);
        java.lang.Long long5 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
    }

    @Test
    public void MutableLong659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong659");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 1);
        mutableLong1.setValue((long) (byte) 100);
        float float4 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void MutableLong660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong660");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 10);
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        java.lang.String str4 = mutableLong3.toString();
        java.lang.Long long5 = mutableLong3.getValue();
        java.lang.Long long6 = mutableLong3.toLong();
        mutableLong1.setValue((java.lang.Number) long6);
        float float8 = mutableLong1.floatValue();
        float float9 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void MutableLong661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong661");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.add((long) (byte) -57);
        int int5 = mutableLong1.intValue();
        long long6 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-47) + "'", int5 == (-47));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-47L) + "'", long6 == (-47L));
    }

    @Test
    public void MutableLong662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong662");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        double double4 = mutableLong3.doubleValue();
        java.lang.Long long5 = mutableLong3.getValue();
        double double6 = mutableLong3.doubleValue();
        byte byte7 = mutableLong3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void MutableLong663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong663");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.subtract(98L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void MutableLong664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong664");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        mutableLong1.increment();
        java.lang.String str8 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "3" + "'", str8.equals("3"));
    }

    @Test
    public void MutableLong665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong665");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.decrement();
        long long3 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong4.decrement();
        mutableLong4.add((java.lang.Number) 0);
        java.lang.Long long8 = mutableLong4.toLong();
        mutableLong1.add((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
    }

    @Test
    public void MutableLong666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong666");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-100));
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        java.lang.Long long6 = mutableLong4.getValue();
        mutableLong1.subtract((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6.equals(10L));
    }

    @Test
    public void MutableLong667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong667");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        double double5 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void MutableLong668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong668");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        mutableLong1.setValue((long) 'a');
        java.lang.Class<?> wildcardClass5 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong669");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) -2);
    }

    @Test
    public void MutableLong670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong670");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -99);
        mutableLong1.decrement();
        java.lang.Long long3 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-100L) + "'", long3.equals((-100L)));
    }

    @Test
    public void MutableLong671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong671");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.subtract((java.lang.Number) (byte) 1);
        mutableLong0.add((long) (short) -41);
    }

    @Test
    public void MutableLong672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong672");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '4');
        mutableLong1.increment();
    }

    @Test
    public void MutableLong673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong673");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(35L);
    }

    @Test
    public void MutableLong674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong674");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        java.lang.Long long2 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) mutableLong4);
        mutableLong1.subtract(8L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2.equals(10L));
    }

    @Test
    public void MutableLong675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong675");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 3);
        long long2 = mutableLong1.longValue();
        java.lang.Long long3 = mutableLong1.getValue();
        mutableLong1.add((long) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3.equals(3L));
    }

    @Test
    public void MutableLong676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong676");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 0);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong677");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 10);
        mutableLong1.add((-2L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-2L));
        java.lang.Long long5 = mutableLong4.toLong();
        mutableLong4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2L) + "'", long5.equals((-2L)));
    }

    @Test
    public void MutableLong678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong678");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-41L));
    }

    @Test
    public void MutableLong679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong679");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        long long1 = mutableLong0.longValue();
        long long2 = mutableLong0.longValue();
        java.lang.Number number3 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong0.subtract(number3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void MutableLong680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong680");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void MutableLong681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong681");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("35");
        mutableLong1.subtract((long) (short) 1);
    }

    @Test
    public void MutableLong682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong682");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong3.subtract((long) (short) 9);
        long long6 = mutableLong3.longValue();
        long long7 = mutableLong3.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-9L) + "'", long6 == (-9L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-9L) + "'", long7 == (-9L));
    }

    @Test
    public void MutableLong683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong683");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        int int6 = mutableLong1.intValue();
        float float7 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void MutableLong684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong684");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 1);
        java.lang.String str7 = mutableLong1.toString();
        float float8 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9" + "'", str7.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 9.0f + "'", float8 == 9.0f);
    }

    @Test
    public void MutableLong685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong685");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        float float2 = mutableLong0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void MutableLong686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong686");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-100L));
        int int3 = mutableLong2.intValue();
        mutableLong2.add((-100L));
        long long6 = mutableLong2.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-200L) + "'", long6 == (-200L));
    }

    @Test
    public void MutableLong687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong687");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        boolean boolean3 = mutableLong0.equals((java.lang.Object) (-99.0f));
        mutableLong0.setValue((long) (byte) 56);
        mutableLong0.subtract((-2L));
        int int8 = mutableLong0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
    }

    @Test
    public void MutableLong688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong1.MutableLong688");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        java.lang.Long long7 = mutableLong1.getValue();
        java.lang.Long long8 = mutableLong1.getValue();
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }
}

