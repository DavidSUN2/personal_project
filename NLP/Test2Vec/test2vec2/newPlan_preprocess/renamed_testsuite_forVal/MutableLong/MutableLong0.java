
package MutableLong;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableLong0 {

    public static boolean debug = false;

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test01");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test02");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test03");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        double double2 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test04");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (byte) 1);
        int int4 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong("1");
        mutableLong6.setValue((long) (byte) -1);
        int int9 = mutableLong1.compareTo(mutableLong6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test05");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str5 = mutableLong4.toString();
        int int6 = mutableLong1.compareTo(mutableLong4);
        java.lang.Long long7 = mutableLong4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test06");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 10);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test07");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        mutableLong1.setValue((long) (byte) -1);
        float float4 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test08");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        byte byte4 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test09");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test10");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Class<?> wildcardClass1 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str4 = mutableLong3.toString();
        java.lang.Long long5 = mutableLong3.toLong();
        mutableLong1.subtract((java.lang.Number) long5);
        byte byte7 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test12");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        mutableLong1.decrement();
        mutableLong1.setValue((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test13");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        mutableLong1.subtract(1L);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong4.setValue((java.lang.Number) (-1));
        int int7 = mutableLong1.compareTo(mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test14");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test15");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        mutableLong1.decrement();
        java.lang.Long long4 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test16");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        java.lang.String str4 = mutableLong1.toString();
        java.lang.Long long5 = mutableLong1.toLong();
        long long6 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test17");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Object obj1 = null;
        boolean boolean2 = mutableLong0.equals(obj1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test18");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (byte) 1);
        int int4 = mutableLong1.intValue();
        java.lang.Class<?> wildcardClass5 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test19");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        mutableLong1.subtract((long) (short) 100);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test20");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.increment();
        mutableLong1.add(0L);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        double double6 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test21");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        mutableLong1.subtract(1L);
        double double4 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test22");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        mutableLong1.setValue((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test23");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong3.decrement();
        mutableLong3.decrement();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test24");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long5 = mutableLong4.getValue();
        mutableLong1.setValue((java.lang.Number) long5);
        float float7 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test25");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long5 = mutableLong4.getValue();
        mutableLong1.setValue((java.lang.Number) long5);
        java.lang.Class<?> wildcardClass7 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test26");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        float float2 = mutableLong1.floatValue();
        short short3 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test27");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.setValue((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2.equals(10L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test28");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test29");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.setValue((java.lang.Number) (-1));
        mutableLong0.add(10L);
        byte byte5 = mutableLong0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 9 + "'", byte5 == (byte) 9);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test30");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test31");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test32");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        mutableLong1.subtract((long) (short) 100);
        mutableLong1.increment();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test33");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong1.decrement();
        byte byte5 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test34");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        float float2 = mutableLong1.floatValue();
        mutableLong1.increment();
        int int4 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test35");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        int int3 = mutableLong1.intValue();
        java.lang.String str4 = mutableLong1.toString();
        int int5 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test36");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        java.lang.String str4 = mutableLong1.toString();
        java.lang.Long long5 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong("1");
        java.lang.Class<?> wildcardClass8 = mutableLong7.getClass();
        boolean boolean9 = mutableLong1.equals((java.lang.Object) wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test37");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long5 = mutableLong4.getValue();
        mutableLong1.setValue((java.lang.Number) long5);
        java.lang.String str7 = mutableLong1.toString();
        java.lang.Long long8 = mutableLong1.getValue();
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9.equals(0L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test38");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong1.decrement();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        int int7 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test39");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str4 = mutableLong3.toString();
        java.lang.Long long5 = mutableLong3.toLong();
        mutableLong1.subtract((java.lang.Number) long5);
        java.lang.Long long7 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test40");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        boolean boolean3 = mutableLong0.equals((java.lang.Object) "0");
        mutableLong0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test41");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        mutableLong1.setValue((java.lang.Number) 1.0f);
        int int6 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test42");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        long long2 = mutableLong1.longValue();
        mutableLong1.setValue(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test43");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.increment();
        mutableLong1.add(0L);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long6 = mutableLong5.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6.equals(2L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test44");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        java.lang.String str4 = mutableLong1.toString();
        mutableLong1.subtract((long) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test45");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 0);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test46");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        mutableLong1.subtract(1L);
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test47");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 100);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test48");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long5 = mutableLong4.getValue();
        mutableLong1.setValue((java.lang.Number) long5);
        java.lang.String str7 = mutableLong1.toString();
        java.lang.Long long8 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) long8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8.equals(0L));
    }
}

