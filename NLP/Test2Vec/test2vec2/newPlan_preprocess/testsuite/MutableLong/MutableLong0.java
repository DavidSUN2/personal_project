package MutableLong;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MutableLong0 {

    public static boolean debug = false;

    @Test
    public void MutableLong001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong001");
        // The following exception was thrown during execution in MutableLong generation
        try {
            org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong002");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableLong003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong003");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        byte byte5 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void MutableLong004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong004");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        byte byte4 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableLong005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong005");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        java.lang.Class<?> wildcardClass4 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableLong006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong006");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.setValue((long) (short) 100);
        byte byte4 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void MutableLong007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong007");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        long long3 = mutableLong0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void MutableLong008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong008");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong5.subtract((java.lang.Number) (short) 0);
        int int8 = mutableLong1.compareTo(mutableLong5);
        java.lang.Class<?> wildcardClass9 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong009");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long4 = mutableLong3.getValue();
        mutableLong3.decrement();
        float float6 = mutableLong3.floatValue();
        java.lang.String str7 = mutableLong3.toString();
        java.lang.Long long8 = mutableLong3.toLong();
        int int9 = mutableLong1.compareTo(mutableLong3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1" + "'", str7.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableLong010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong010");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        mutableLong1.decrement();
        long long9 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-100L) + "'", long9 == (-100L));
    }

    @Test
    public void MutableLong011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong011");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        boolean boolean8 = mutableLong1.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass9 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong012");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        mutableLong1.add(1L);
    }

    @Test
    public void MutableLong013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong013");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        java.lang.Class<?> wildcardClass2 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong014");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.Class<?> wildcardClass5 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong015");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        double double8 = mutableLong1.doubleValue();
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.0d) + "'", double8 == (-99.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-99L) + "'", long9.equals((-99L)));
    }

    @Test
    public void MutableLong016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong016");
        // The following exception was thrown during execution in MutableLong generation
        try {
            org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong017");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        long long7 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) long7);
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
    public void MutableLong018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong018");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        java.lang.String str8 = mutableLong1.toString();
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-99" + "'", str8.equals("-99"));
    }

    @Test
    public void MutableLong019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong019");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        short short3 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableLong020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong020");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        mutableLong5.subtract((-99L));
        mutableLong5.add((java.lang.Number) (-99.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableLong021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong021");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong1.setValue(number4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
    }

    @Test
    public void MutableLong022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong022");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        java.lang.String str8 = mutableLong1.toString();
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-99" + "'", str8.equals("-99"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
    }

    @Test
    public void MutableLong023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong023");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        byte byte4 = mutableLong0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void MutableLong024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong024");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        byte byte7 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 2 + "'", byte7 == (byte) 2);
    }

    @Test
    public void MutableLong025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong025");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        mutableLong5.subtract((-99L));
        mutableLong5.add((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableLong026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong026");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        mutableLong1.increment();
        java.lang.Class<?> wildcardClass5 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong027");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        long long3 = mutableLong1.longValue();
        java.lang.Class<?> wildcardClass4 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableLong028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong028");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        long long1 = mutableLong0.longValue();
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong0.setValue(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void MutableLong029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong029");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        mutableLong1.decrement();
        java.lang.Class<?> wildcardClass6 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong030");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        mutableLong1.add((long) 'a');
        mutableLong1.subtract(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void MutableLong031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong031");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableLong032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong032");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        java.lang.Long long2 = mutableLong1.toLong();
        short short3 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableLong033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong033");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong("-99");
        mutableLong1.subtract((java.lang.Number) mutableLong8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
    }

    @Test
    public void MutableLong034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong034");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        java.lang.Long long2 = mutableLong1.toLong();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong035");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong5.subtract((java.lang.Number) (short) 0);
        int int8 = mutableLong1.compareTo(mutableLong5);
        double double9 = mutableLong5.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void MutableLong036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong036");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((long) (-1));
        mutableLong1.subtract((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong037");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        boolean boolean7 = mutableLong1.equals((java.lang.Object) 100L);
        java.lang.String str8 = mutableLong1.toString();
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableLong038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong038");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        mutableLong1.add((long) 'a');
        short short8 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 98 + "'", short8 == (short) 98);
    }

    @Test
    public void MutableLong039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong039");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.add((java.lang.Number) (-1L));
        long long6 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 19L + "'", long6 == 19L);
    }

    @Test
    public void MutableLong040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong040");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.add((java.lang.Number) (-1L));
        mutableLong1.add((java.lang.Number) 0.0f);
        double double8 = mutableLong1.doubleValue();
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 19.0d + "'", double8 == 19.0d);
    }

    @Test
    public void MutableLong041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong041");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Class<?> wildcardClass7 = mutableLong6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong042");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong6.decrement();
        mutableLong1.subtract((java.lang.Number) mutableLong6);
        java.lang.Class<?> wildcardClass9 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong043");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong6.decrement();
        mutableLong1.subtract((java.lang.Number) mutableLong6);
        java.lang.Long long9 = mutableLong6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9.equals((-1L)));
    }

    @Test
    public void MutableLong044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong044");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        double double8 = mutableLong1.doubleValue();
        byte byte9 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.0d) + "'", double8 == (-99.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -99 + "'", byte9 == (byte) -99);
    }

    @Test
    public void MutableLong045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong045");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((long) (-1));
        mutableLong1.add((long) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong046");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        mutableLong5.subtract((-99L));
        byte byte8 = mutableLong5.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -57 + "'", byte8 == (byte) -57);
    }

    @Test
    public void MutableLong047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong047");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        java.lang.Long long8 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8.equals((-99L)));
    }

    @Test
    public void MutableLong048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong048");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long5 = mutableLong4.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong0.subtract(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void MutableLong049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong049");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str6 = mutableLong5.toString();
        float float7 = mutableLong5.floatValue();
        mutableLong1.add((java.lang.Number) float7);
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void MutableLong050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong050");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        byte byte4 = mutableLong3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableLong051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong051");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        short short7 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void MutableLong052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong052");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong5.add((java.lang.Number) 10.0f);
        java.lang.Long long8 = mutableLong5.getValue();
        mutableLong3.setValue((java.lang.Number) mutableLong5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8.equals(10L));
    }

    @Test
    public void MutableLong053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong053");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 0);
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableLong054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong054");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long5 = mutableLong4.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        java.lang.String str7 = mutableLong4.toString();
        mutableLong1.add((java.lang.Number) mutableLong4);
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
    }

    @Test
    public void MutableLong055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong055");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong6.subtract((long) (byte) 2);
        int int9 = mutableLong6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableLong056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong056");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong5.subtract((java.lang.Number) (short) 0);
        int int8 = mutableLong1.compareTo(mutableLong5);
        java.lang.Long long9 = mutableLong5.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9.equals(0L));
    }

    @Test
    public void MutableLong057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong057");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((java.lang.Number) 100L);
        byte byte5 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -101 + "'", byte5 == (byte) -101);
    }

    @Test
    public void MutableLong058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong058");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        mutableLong1.decrement();
        mutableLong1.setValue((long) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void MutableLong059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong059");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        java.lang.Long long8 = mutableLong1.toLong();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8.equals((-99L)));
    }

    @Test
    public void MutableLong060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong060");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        byte byte5 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void MutableLong061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong061");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.setValue((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong062");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        boolean boolean7 = mutableLong1.equals((java.lang.Object) 100L);
        double double8 = mutableLong1.doubleValue();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void MutableLong063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong063");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        mutableLong1.increment();
        int int8 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void MutableLong064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong064");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.String str5 = mutableLong4.toString();
        java.lang.Class<?> wildcardClass6 = mutableLong4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong065");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long7 = mutableLong6.getValue();
        int int8 = mutableLong6.intValue();
        int int9 = mutableLong1.compareTo(mutableLong6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableLong066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong066");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Class<?> wildcardClass7 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong067");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        mutableLong1.increment();
    }

    @Test
    public void MutableLong068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong068");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        float float2 = mutableLong1.floatValue();
        byte byte3 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableLong069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong069");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        java.lang.Long long7 = mutableLong1.getValue();
        java.lang.Long long8 = mutableLong1.toLong();
        double double9 = mutableLong1.doubleValue();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableLong070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong070");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (short) 98);
        mutableLong1.add((long) (short) 100);
    }

    @Test
    public void MutableLong071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong071");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableLong072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong072");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        short short5 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void MutableLong073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong073");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        java.lang.Long long7 = mutableLong1.getValue();
        java.lang.Long long8 = mutableLong1.toLong();
        byte byte9 = mutableLong1.byteValue();
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
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableLong074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong074");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        java.lang.Long long7 = mutableLong1.getValue();
        java.lang.Long long8 = mutableLong1.toLong();
        long long9 = mutableLong1.longValue();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableLong075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong075");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        java.lang.Long long5 = mutableLong1.getValue();
        java.lang.Class<?> wildcardClass6 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong076");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        double double4 = mutableLong3.doubleValue();
        java.lang.Class<?> wildcardClass5 = mutableLong3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong077");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        double double4 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableLong078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong078");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        int int8 = mutableLong7.intValue();
        float float9 = mutableLong7.floatValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void MutableLong079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong079");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong3.increment();
        int int5 = mutableLong3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableLong080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong080");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str4 = mutableLong3.toString();
        mutableLong3.setValue((long) (byte) 100);
        double double7 = mutableLong3.doubleValue();
        mutableLong0.subtract((java.lang.Number) mutableLong3);
        mutableLong3.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void MutableLong081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong081");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        java.lang.Long long7 = mutableLong1.getValue();
        mutableLong1.setValue(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7.equals(1L));
    }

    @Test
    public void MutableLong082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong082");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -99);
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -99 + "'", byte2 == (byte) -99);
    }

    @Test
    public void MutableLong083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong083");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double7 = mutableLong0.doubleValue();
        mutableLong0.setValue((-2L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-10.0d) + "'", double7 == (-10.0d));
    }

    @Test
    public void MutableLong084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong084");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.add(10L);
        java.lang.Long long8 = mutableLong1.toLong();
        java.lang.Class<?> wildcardClass9 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8.equals(9L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong085");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        byte byte7 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void MutableLong086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong086");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Class<?> wildcardClass7 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong087");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong088");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long5 = mutableLong4.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        java.lang.String str7 = mutableLong4.toString();
        mutableLong1.add((java.lang.Number) mutableLong4);
        float float9 = mutableLong4.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void MutableLong089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong089");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableLong090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong090");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.subtract((java.lang.Number) mutableLong7);
        double double9 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void MutableLong091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong091");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str6 = mutableLong5.toString();
        float float7 = mutableLong5.floatValue();
        mutableLong1.add((java.lang.Number) float7);
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void MutableLong092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong092");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        mutableLong1.decrement();
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-100L) + "'", long9.equals((-100L)));
    }

    @Test
    public void MutableLong093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong093");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        double double8 = mutableLong1.doubleValue();
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.0d) + "'", double8 == (-99.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
    }

    @Test
    public void MutableLong094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong094");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        java.lang.Long long5 = mutableLong1.getValue();
        short short6 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void MutableLong095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong095");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.String str7 = mutableLong4.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "10" + "'", str7.equals("10"));
    }

    @Test
    public void MutableLong096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong096");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long8 = mutableLong7.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
    }

    @Test
    public void MutableLong097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong097");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long7 = mutableLong6.getValue();
        mutableLong6.add((long) (-47));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7.equals((-1L)));
    }

    @Test
    public void MutableLong098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong098");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        java.lang.Long long5 = mutableLong1.getValue();
        short short6 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableLong099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong099");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        byte byte3 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void MutableLong100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong100");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        float float4 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void MutableLong101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong101");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        int int2 = mutableLong0.intValue();
        mutableLong0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void MutableLong102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong102");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong103");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((java.lang.Number) 10.0f);
        float float5 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) float5);
        byte byte7 = mutableLong6.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableLong104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong104");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        boolean boolean3 = mutableLong0.equals((java.lang.Object) (-99.0f));
        byte byte4 = mutableLong0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
    }

    @Test
    public void MutableLong105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong105");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long5 = mutableLong4.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.String str8 = mutableLong4.toString();
        short short9 = mutableLong4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void MutableLong106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong106");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        boolean boolean6 = mutableLong1.equals((java.lang.Object) (short) 0);
        boolean boolean8 = mutableLong1.equals((java.lang.Object) 10.0d);
        byte byte9 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void MutableLong107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong107");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        mutableLong1.decrement();
        mutableLong1.add((java.lang.Number) (-47));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void MutableLong108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong108");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        java.lang.Class<?> wildcardClass7 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong109");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long5 = mutableLong4.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.String str8 = mutableLong4.toString();
        byte byte9 = mutableLong4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void MutableLong110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong110");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.subtract((long) (short) 10);
        mutableLong1.decrement();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong111");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        mutableLong1.setValue((-1L));
        double double9 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void MutableLong112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong112");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        java.lang.Class<?> wildcardClass5 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong113");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        java.lang.Long long3 = mutableLong1.toLong();
        byte byte4 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableLong114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong114");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        boolean boolean7 = mutableLong1.equals((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass8 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableLong115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong115");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.setValue((long) (short) 100);
        short short4 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void MutableLong116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong116");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        long long7 = mutableLong1.longValue();
        java.lang.Long long8 = mutableLong1.toLong();
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void MutableLong117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong117");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.add(10L);
        java.lang.Long long8 = mutableLong1.toLong();
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8.equals(9L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9 == (short) 9);
    }

    @Test
    public void MutableLong118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong118");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 0);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong119");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        java.lang.Long long4 = mutableLong0.toLong();
        byte byte5 = mutableLong0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void MutableLong120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong120");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.add((long) (short) -1);
        mutableLong1.increment();
        double double6 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void MutableLong121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong121");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -57);
    }

    @Test
    public void MutableLong122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong122");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        java.lang.Long long8 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8.equals((-99L)));
    }

    @Test
    public void MutableLong123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong123");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        int int7 = mutableLong1.intValue();
        java.lang.Long long8 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
    }

    @Test
    public void MutableLong124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong124");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        boolean boolean9 = mutableLong1.equals((java.lang.Object) "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableLong125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong125");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.decrement();
        java.lang.Long long3 = mutableLong0.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long5 = mutableLong4.getValue();
        mutableLong4.add((java.lang.Number) (-99.0d));
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.Long long9 = mutableLong4.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3.equals((-2L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-99L) + "'", long9.equals((-99L)));
    }

    @Test
    public void MutableLong126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong126");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        float float3 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void MutableLong127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong127");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        boolean boolean8 = mutableLong1.equals((java.lang.Object) 10L);
        byte byte9 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableLong128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong128");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -99);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong129");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        float float2 = mutableLong1.floatValue();
        mutableLong1.subtract((java.lang.Number) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableLong130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong130");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long7 = mutableLong6.getValue();
        mutableLong6.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7.equals((-1L)));
    }

    @Test
    public void MutableLong131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong131");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        java.lang.Long long2 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2.equals(100L));
    }

    @Test
    public void MutableLong132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong132");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.subtract((java.lang.Number) mutableLong7);
        short short9 = mutableLong7.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void MutableLong133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong133");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        mutableLong1.setValue((-1L));
        byte byte9 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void MutableLong134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong134");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        boolean boolean8 = mutableLong1.equals((java.lang.Object) 10L);
        java.lang.Long long9 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void MutableLong135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong135");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.subtract((long) (short) 9);
    }

    @Test
    public void MutableLong136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong136");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long5 = mutableLong4.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.String str8 = mutableLong0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void MutableLong137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong137");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.subtract((long) (short) 10);
        short short8 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -10 + "'", short8 == (short) -10);
    }

    @Test
    public void MutableLong138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong138");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong7.add((-100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
    }

    @Test
    public void MutableLong139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong139");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.add((long) (byte) -57);
        int int5 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str7 = mutableLong6.toString();
        float float8 = mutableLong6.floatValue();
        boolean boolean9 = mutableLong1.equals((java.lang.Object) mutableLong6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-47) + "'", int5 == (-47));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableLong140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong140");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong5.subtract((java.lang.Number) (short) 0);
        int int8 = mutableLong1.compareTo(mutableLong5);
        float float9 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableLong141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong141");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        java.lang.Class<?> wildcardClass7 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong142");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (short) 98);
        double double4 = mutableLong1.doubleValue();
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong1.add(number5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-97.0d) + "'", double4 == (-97.0d));
    }

    @Test
    public void MutableLong143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong143");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        int int4 = mutableLong0.intValue();
        mutableLong0.subtract((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99) + "'", int4 == (-99));
    }

    @Test
    public void MutableLong144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong144");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong6.subtract((long) (byte) 2);
        java.lang.Long long9 = mutableLong6.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9.equals((-1L)));
    }

    @Test
    public void MutableLong145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong145");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -100 + "'", byte2 == (byte) -100);
    }

    @Test
    public void MutableLong146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong146");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        short short8 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableLong147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong147");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.decrement();
        java.lang.Long long3 = mutableLong0.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long5 = mutableLong4.getValue();
        mutableLong4.add((java.lang.Number) (-99.0d));
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.Class<?> wildcardClass9 = mutableLong4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-2L) + "'", long3.equals((-2L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong148");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        int int7 = mutableLong1.intValue();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void MutableLong149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong149");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        float float4 = mutableLong0.floatValue();
        mutableLong0.add(0L);
        boolean boolean8 = mutableLong0.equals((java.lang.Object) "");
        int int9 = mutableLong0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableLong150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong150");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong7.add((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
    }

    @Test
    public void MutableLong151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong151");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        java.lang.Long long4 = mutableLong0.getValue();
        mutableLong0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4.equals((-99L)));
    }

    @Test
    public void MutableLong152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong152");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.add((long) (short) -1);
        java.lang.Class<?> wildcardClass5 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong153");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong6.add((long) (byte) 100);
    }

    @Test
    public void MutableLong154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong154");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.decrement();
        short short3 = mutableLong0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableLong155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong155");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        double double7 = mutableLong1.doubleValue();
        byte byte8 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void MutableLong156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong156");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long5 = mutableLong4.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        java.lang.String str7 = mutableLong4.toString();
        mutableLong1.add((java.lang.Number) mutableLong4);
        byte byte9 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void MutableLong157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong157");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.String str5 = mutableLong4.toString();
        mutableLong4.subtract((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
    }

    @Test
    public void MutableLong158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong158");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        int int6 = mutableLong1.intValue();
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void MutableLong159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong159");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        short short5 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void MutableLong160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong160");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.add((java.lang.Number) (-1L));
        mutableLong1.add((java.lang.Number) 0.0f);
        int int8 = mutableLong1.intValue();
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void MutableLong161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong161");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 100);
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong162");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        short short3 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableLong163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong163");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.subtract((java.lang.Number) mutableLong7);
        mutableLong7.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void MutableLong164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong164");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.setValue((long) 10);
    }

    @Test
    public void MutableLong165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong165");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double7 = mutableLong4.doubleValue();
        mutableLong4.decrement();
        java.lang.Class<?> wildcardClass9 = mutableLong4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong166");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        float float4 = mutableLong0.floatValue();
        short short5 = mutableLong0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void MutableLong167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong167");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.decrement();
        mutableLong0.decrement();
        float float4 = mutableLong0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-2.0f) + "'", float4 == (-2.0f));
    }

    @Test
    public void MutableLong168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong168");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        long long6 = mutableLong1.longValue();
        mutableLong1.add((long) 10);
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void MutableLong169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong169");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) ' ');
    }

    @Test
    public void MutableLong170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong170");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        int int7 = mutableLong1.intValue();
        java.lang.Long long8 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
    }

    @Test
    public void MutableLong171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong171");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        boolean boolean7 = mutableLong1.equals((java.lang.Object) 100L);
        java.lang.String str8 = mutableLong1.toString();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void MutableLong172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong172");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((java.lang.Number) (byte) -99);
        java.lang.Long long8 = mutableLong1.toLong();
        double double9 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8.equals((-99L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-99.0d) + "'", double9 == (-99.0d));
    }

    @Test
    public void MutableLong173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong173");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        long long7 = mutableLong1.longValue();
        float float8 = mutableLong1.floatValue();
        byte byte9 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void MutableLong174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong174");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((long) 19);
        java.lang.Class<?> wildcardClass5 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong175");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        short short8 = mutableLong3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableLong176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong176");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double7 = mutableLong4.doubleValue();
        double double8 = mutableLong4.doubleValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) double8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void MutableLong177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong177");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("10");
        mutableLong1.subtract((long) (-47));
    }

    @Test
    public void MutableLong178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong178");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong6.decrement();
        mutableLong1.subtract((java.lang.Number) mutableLong6);
        int int9 = mutableLong6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableLong179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong179");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        long long6 = mutableLong1.longValue();
        mutableLong1.add((long) 10);
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void MutableLong180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong180");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 1);
        mutableLong1.increment();
        mutableLong1.subtract((long) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableLong181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong181");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        long long8 = mutableLong1.longValue();
        java.lang.Long long9 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9.equals((-1L)));
    }

    @Test
    public void MutableLong182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong182");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.add((long) (short) -1);
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        mutableLong1.subtract((java.lang.Number) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void MutableLong183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong183");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Class<?> wildcardClass6 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong184");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str4 = mutableLong3.toString();
        mutableLong3.setValue((long) (byte) 100);
        double double7 = mutableLong3.doubleValue();
        mutableLong0.subtract((java.lang.Number) mutableLong3);
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void MutableLong185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong185");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        long long4 = mutableLong3.longValue();
        java.lang.Class<?> wildcardClass5 = mutableLong3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong186");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong6);
        int int8 = mutableLong1.compareTo(mutableLong7);
        java.lang.String str9 = mutableLong7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "35" + "'", str9.equals("35"));
    }

    @Test
    public void MutableLong187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong187");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        mutableLong1.add((long) 'a');
        double double8 = mutableLong1.doubleValue();
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 98.0d + "'", double8 == 98.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 98L + "'", long9.equals(98L));
    }

    @Test
    public void MutableLong188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong188");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str6 = mutableLong5.toString();
        float float7 = mutableLong5.floatValue();
        mutableLong1.add((java.lang.Number) float7);
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableLong189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong189");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        double double4 = mutableLong0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-99.0d) + "'", double4 == (-99.0d));
    }

    @Test
    public void MutableLong190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong190");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.add(10L);
        mutableLong1.subtract((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
    }

    @Test
    public void MutableLong191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong191");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong192");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long7 = mutableLong1.getValue();
        java.lang.Long long8 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
    }

    @Test
    public void MutableLong193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong193");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        long long6 = mutableLong1.longValue();
        mutableLong1.add((long) 10);
        java.lang.String str9 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "9" + "'", str9.equals("9"));
    }

    @Test
    public void MutableLong194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong194");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        int int2 = mutableLong1.intValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableLong195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong195");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        java.lang.String str7 = mutableLong1.toString();
        java.lang.String str8 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1" + "'", str7.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1" + "'", str8.equals("-1"));
    }

    @Test
    public void MutableLong196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong196");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        long long6 = mutableLong1.longValue();
        java.lang.String str7 = mutableLong1.toString();
        mutableLong1.setValue((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-1" + "'", str7.equals("-1"));
    }

    @Test
    public void MutableLong197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong197");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 10);
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2.equals(10L));
    }

    @Test
    public void MutableLong198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong198");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        float float3 = mutableLong2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void MutableLong199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong199");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.Long long7 = mutableLong0.toLong();
        mutableLong0.add((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-10L) + "'", long7.equals((-10L)));
    }

    @Test
    public void MutableLong200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong200");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.subtract((java.lang.Number) mutableLong7);
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void MutableLong201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong201");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        long long2 = mutableLong1.longValue();
        long long3 = mutableLong1.longValue();
        int int4 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void MutableLong202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong202");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        int int6 = mutableLong1.intValue();
        double double7 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void MutableLong203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong203");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        int int3 = mutableLong1.intValue();
        java.lang.Class<?> wildcardClass4 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableLong204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong204");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        mutableLong1.setValue((-1L));
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableLong205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong205");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        mutableLong1.increment();
        mutableLong1.subtract(0L);
    }

    @Test
    public void MutableLong206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong206");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.Class<?> wildcardClass6 = mutableLong5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong207");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableLong208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong208");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        mutableLong1.add(0L);
        float float9 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableLong209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong209");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        mutableLong1.setValue((java.lang.Number) (-10.0d));
    }

    @Test
    public void MutableLong210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong210");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        double double2 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableLong211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong211");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        java.lang.Long long5 = mutableLong4.toLong();
        mutableLong1.add((java.lang.Number) mutableLong4);
        byte byte7 = mutableLong4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void MutableLong212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong212");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong3.add((java.lang.Number) 10);
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((long) 3);
        boolean boolean8 = mutableLong3.equals((java.lang.Object) 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableLong213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong213");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        float float2 = mutableLong1.floatValue();
        mutableLong1.setValue((long) '#');
        long long5 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void MutableLong214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong214");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(10L);
        mutableLong1.increment();
        mutableLong1.increment();
    }

    @Test
    public void MutableLong215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong215");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        int int2 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void MutableLong216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong216");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong6);
        int int8 = mutableLong1.compareTo(mutableLong7);
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableLong217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong217");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        mutableLong0.increment();
        mutableLong0.increment();
        byte byte6 = mutableLong0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -97 + "'", byte6 == (byte) -97);
    }

    @Test
    public void MutableLong218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong218");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 10);
        mutableLong1.increment();
    }

    @Test
    public void MutableLong219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong219");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        mutableLong1.setValue((long) 'a');
        mutableLong1.setValue(9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void MutableLong220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong220");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong3.add((java.lang.Number) 10);
        mutableLong3.decrement();
        mutableLong3.setValue((long) (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void MutableLong221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong221");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        java.lang.Long long4 = mutableLong0.getValue();
        long long5 = mutableLong0.longValue();
        int int6 = mutableLong0.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4.equals((-99L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-99L) + "'", long5 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-99) + "'", int6 == (-99));
    }

    @Test
    public void MutableLong222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong222");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        long long3 = mutableLong1.longValue();
        byte byte4 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableLong223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong223");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.add((long) 'a');
        mutableLong1.setValue((long) 35);
    }

    @Test
    public void MutableLong224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong224");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        boolean boolean7 = mutableLong1.equals((java.lang.Object) 100L);
        java.lang.String str8 = mutableLong1.toString();
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableLong225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong225");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.decrement();
        short short5 = mutableLong0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -2 + "'", short5 == (short) -2);
    }

    @Test
    public void MutableLong226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong226");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.getValue();
        java.lang.Long long4 = mutableLong1.toLong();
        java.lang.Long long5 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5.equals(100L));
    }

    @Test
    public void MutableLong227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong227");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 3);
        long long2 = mutableLong1.longValue();
        java.lang.Object obj3 = null;
        boolean boolean4 = mutableLong1.equals(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableLong228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong228");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 0);
        java.lang.Long long7 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
    }

    @Test
    public void MutableLong229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong229");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        java.lang.Long long4 = mutableLong0.getValue();
        long long5 = mutableLong0.longValue();
        java.lang.Long long6 = mutableLong0.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4.equals((-99L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-99L) + "'", long5 == (-99L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6.equals((-99L)));
    }

    @Test
    public void MutableLong230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong230");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 1);
        java.lang.Long long2 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2.equals(1L));
    }

    @Test
    public void MutableLong231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong231");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        byte byte3 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableLong232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong232");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        boolean boolean7 = mutableLong1.equals((java.lang.Object) 100L);
        java.lang.String str8 = mutableLong1.toString();
        long long9 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableLong233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong233");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((java.lang.Number) (byte) -99);
        float float8 = mutableLong1.floatValue();
        java.lang.Class<?> wildcardClass9 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-99.0f) + "'", float8 == (-99.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong234");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.add((long) (byte) -57);
        mutableLong1.increment();
        mutableLong1.subtract((long) (short) -10);
        java.lang.Long long8 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-36L) + "'", long8.equals((-36L)));
    }

    @Test
    public void MutableLong235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong235");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        java.lang.Class<?> wildcardClass8 = mutableLong3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableLong236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong236");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong1.subtract(number4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
    }

    @Test
    public void MutableLong237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong237");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        float float2 = mutableLong1.floatValue();
        mutableLong1.setValue((long) '#');
        double double5 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void MutableLong238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong238");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        long long6 = mutableLong1.longValue();
        long long7 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void MutableLong239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong239");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-10L));
    }

    @Test
    public void MutableLong240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong240");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong1.subtract((long) 0);
    }

    @Test
    public void MutableLong241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong241");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((java.lang.Number) (byte) -99);
        short short8 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -99 + "'", short8 == (short) -99);
    }

    @Test
    public void MutableLong242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong242");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.setValue((long) 10);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            int int5 = mutableLong1.compareTo(mutableLong4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong243");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.decrement();
        double double5 = mutableLong0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
    }

    @Test
    public void MutableLong244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong244");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        int int2 = mutableLong1.intValue();
        float float3 = mutableLong1.floatValue();
        mutableLong1.increment();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        float float8 = mutableLong7.floatValue();
        mutableLong1.add((java.lang.Number) float8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "11" + "'", str5.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void MutableLong245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong245");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((long) 19);
        mutableLong1.decrement();
        short short6 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -21 + "'", short6 == (short) -21);
    }

    @Test
    public void MutableLong246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong246");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        mutableLong0.add((-10L));
        short short7 = mutableLong0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 90 + "'", short7 == (short) 90);
    }

    @Test
    public void MutableLong247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong247");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong5.subtract((java.lang.Number) (short) 0);
        int int8 = mutableLong1.compareTo(mutableLong5);
        java.lang.String str9 = mutableLong5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void MutableLong248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong248");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableLong3.equals(obj4);
        mutableLong3.add((-99L));
        java.lang.Long long8 = mutableLong3.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-100L) + "'", long8.equals((-100L)));
    }

    @Test
    public void MutableLong249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong249");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.Long long2 = mutableLong1.getValue();
        double double3 = mutableLong1.doubleValue();
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableLong1.equals(obj4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong250");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        mutableLong1.setValue((long) (-99));
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
    }

    @Test
    public void MutableLong251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong251");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        mutableLong1.subtract((long) (byte) -57);
        long long5 = mutableLong1.longValue();
        byte byte6 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 56L + "'", long5 == 56L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 56 + "'", byte6 == (byte) 56);
    }

    @Test
    public void MutableLong252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong252");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        java.lang.Long long5 = mutableLong1.getValue();
        double double6 = mutableLong1.doubleValue();
        float float7 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void MutableLong253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong253");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.add(10L);
        mutableLong1.increment();
        java.lang.Long long9 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9.equals(10L));
    }

    @Test
    public void MutableLong254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong254");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        int int2 = mutableLong1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong255");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2.equals(10L));
    }

    @Test
    public void MutableLong256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong256");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((java.lang.Number) (byte) -99);
        byte byte8 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -99 + "'", byte8 == (byte) -99);
    }

    @Test
    public void MutableLong257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong257");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        java.lang.String str4 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            int int6 = mutableLong1.compareTo(mutableLong5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void MutableLong258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong258");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        int int2 = mutableLong0.intValue();
        java.lang.String str3 = mutableLong0.toString();
        java.lang.String str4 = mutableLong0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1" + "'", str3.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-1" + "'", str4.equals("-1"));
    }

    @Test
    public void MutableLong259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong259");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float4 = mutableLong3.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        java.lang.Long long7 = mutableLong6.toLong();
        mutableLong3.add((java.lang.Number) mutableLong6);
        mutableLong1.add((java.lang.Number) mutableLong6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7.equals((-1L)));
    }

    @Test
    public void MutableLong260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong260");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        int int8 = mutableLong1.intValue();
        long long9 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void MutableLong261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong261");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long4 = mutableLong3.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong3);
        double double6 = mutableLong5.doubleValue();
        java.lang.Long long7 = mutableLong5.getValue();
        mutableLong1.subtract((java.lang.Number) mutableLong5);
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7.equals((-1L)));
    }

    @Test
    public void MutableLong262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong262");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong7.add((java.lang.Number) 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong263");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.Long long6 = mutableLong1.getValue();
        mutableLong1.setValue((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6.equals(1L));
    }

    @Test
    public void MutableLong264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong264");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.subtract((long) (short) 10);
        double double8 = mutableLong1.doubleValue();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
    }

    @Test
    public void MutableLong265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong265");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.add((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2.equals(1L));
    }

    @Test
    public void MutableLong266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong266");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.add((java.lang.Number) (byte) 1);
        boolean boolean7 = mutableLong3.equals((java.lang.Object) 10L);
        mutableLong1.add((java.lang.Number) mutableLong3);
        mutableLong3.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void MutableLong267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong267");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.setValue((java.lang.Number) mutableLong5);
        byte byte7 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void MutableLong268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong268");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        mutableLong1.add(0L);
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void MutableLong269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong269");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float4 = mutableLong3.floatValue();
        boolean boolean6 = mutableLong3.equals((java.lang.Object) (-1L));
        mutableLong3.subtract((long) (byte) 0);
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void MutableLong270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong270");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        java.lang.Long long5 = mutableLong1.getValue();
        double double6 = mutableLong1.doubleValue();
        java.lang.Class<?> wildcardClass7 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong271");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong6);
        int int8 = mutableLong1.compareTo(mutableLong7);
        long long9 = mutableLong7.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void MutableLong272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong272");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("10");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str3 = mutableLong2.toString();
        float float4 = mutableLong2.floatValue();
        mutableLong2.setValue((java.lang.Number) (-1L));
        mutableLong2.add((long) (byte) -99);
        mutableLong1.setValue((java.lang.Number) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void MutableLong273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong273");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.add((java.lang.Number) (-1L));
        mutableLong1.add((java.lang.Number) 0.0f);
        mutableLong1.setValue((long) (short) 1);
    }

    @Test
    public void MutableLong274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong274");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        java.lang.Long long5 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
    }

    @Test
    public void MutableLong275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong275");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long4 = mutableLong3.getValue();
        int int5 = mutableLong3.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableLong276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong276");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        mutableLong1.add((long) (-47));
    }

    @Test
    public void MutableLong277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong277");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(10L);
        mutableLong1.increment();
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-8L) + "'", long9.equals((-8L)));
    }

    @Test
    public void MutableLong278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong278");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        float float9 = mutableLong8.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void MutableLong279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong279");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.setValue((java.lang.Number) mutableLong5);
        float float7 = mutableLong5.floatValue();
        java.lang.Long long8 = mutableLong5.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8.equals(0L));
    }

    @Test
    public void MutableLong280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong280");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        java.lang.String str7 = mutableLong1.toString();
        java.lang.Class<?> wildcardClass8 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableLong281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong281");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        byte byte6 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void MutableLong282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong282");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        mutableLong1.increment();
    }

    @Test
    public void MutableLong283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong283");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(10L);
        mutableLong1.decrement();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
    }

    @Test
    public void MutableLong284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong284");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong6);
        int int8 = mutableLong1.compareTo(mutableLong7);
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableLong285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong285");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
    }

    @Test
    public void MutableLong286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong286");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (short) 98);
        double double4 = mutableLong1.doubleValue();
        mutableLong1.subtract((java.lang.Number) 100.0d);
        mutableLong1.decrement();
        byte byte8 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-97.0d) + "'", double4 == (-97.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 58 + "'", byte8 == (byte) 58);
    }

    @Test
    public void MutableLong287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong287");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 0);
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
    }

    @Test
    public void MutableLong288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong288");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        java.lang.String str3 = mutableLong1.toString();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableLong289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong289");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        java.lang.Long long7 = mutableLong1.getValue();
        java.lang.Long long8 = mutableLong1.getValue();
        float float9 = mutableLong1.floatValue();
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
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void MutableLong290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong290");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        java.lang.String str3 = mutableLong1.toString();
        mutableLong1.add((long) (-1));
        java.lang.Class<?> wildcardClass6 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong291");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        java.lang.Long long5 = mutableLong1.getValue();
        byte byte6 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableLong292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong292");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long5 = mutableLong4.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        java.lang.String str7 = mutableLong4.toString();
        mutableLong1.add((java.lang.Number) mutableLong4);
        int int9 = mutableLong4.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void MutableLong293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong293");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        float float2 = mutableLong0.floatValue();
        mutableLong0.setValue((java.lang.Number) (-1L));
        long long5 = mutableLong0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void MutableLong294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong294");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass6 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong295");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        boolean boolean6 = mutableLong1.equals((java.lang.Object) (short) 0);
        boolean boolean8 = mutableLong1.equals((java.lang.Object) 10.0d);
        java.lang.String str9 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1" + "'", str9.equals("-1"));
    }

    @Test
    public void MutableLong296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong296");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        java.lang.Long long5 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong6.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
    }

    @Test
    public void MutableLong297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong297");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong298");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        float float3 = mutableLong2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void MutableLong299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong299");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.add((long) (byte) -57);
        mutableLong1.increment();
        mutableLong1.add((long) (-99));
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void MutableLong300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong300");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.subtract(0L);
        byte byte6 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableLong301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong301");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        mutableLong1.add((long) 'a');
        float float8 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 98.0f + "'", float8 == 98.0f);
    }

    @Test
    public void MutableLong302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong302");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 9);
    }

    @Test
    public void MutableLong303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong303");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        int int4 = mutableLong0.intValue();
        java.lang.Long long5 = mutableLong0.getValue();
        mutableLong0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99) + "'", int4 == (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-99L) + "'", long5.equals((-99L)));
    }

    @Test
    public void MutableLong304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong304");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        double double4 = mutableLong3.doubleValue();
        java.lang.Long long5 = mutableLong3.getValue();
        double double6 = mutableLong3.doubleValue();
        java.lang.Class<?> wildcardClass7 = mutableLong3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong305");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        mutableLong1.setValue((long) (byte) -1);
        byte byte4 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableLong306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong306");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) 100);
        java.lang.Long long3 = mutableLong2.getValue();
        java.lang.String str4 = mutableLong2.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
    }

    @Test
    public void MutableLong307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong307");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong2.subtract((long) 0);
    }

    @Test
    public void MutableLong308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong308");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        mutableLong1.subtract((long) '4');
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -52 + "'", short9 == (short) -52);
    }

    @Test
    public void MutableLong309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong309");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        java.lang.Long long3 = mutableLong1.toLong();
        mutableLong1.setValue((-10L));
        java.lang.Long long6 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-10L) + "'", long6.equals((-10L)));
    }

    @Test
    public void MutableLong310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong310");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        mutableLong1.decrement();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong1.setValue(number8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void MutableLong311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong311");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        int int8 = mutableLong7.intValue();
        byte byte9 = mutableLong7.byteValue();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void MutableLong312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong312");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        java.lang.Long long8 = mutableLong1.toLong();
        java.lang.Long long9 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void MutableLong313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong313");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (short) 90);
    }

    @Test
    public void MutableLong314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong314");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        long long6 = mutableLong0.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) long6);
        mutableLong7.add((long) (byte) 56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void MutableLong315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong315");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        java.lang.Long long6 = mutableLong1.getValue();
        double double7 = mutableLong1.doubleValue();
        short short8 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void MutableLong316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong316");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.Long long2 = mutableLong1.getValue();
        double double3 = mutableLong1.doubleValue();
        java.lang.String str4 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void MutableLong317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong317");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        double double4 = mutableLong0.doubleValue();
        mutableLong0.increment();
        mutableLong0.subtract((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void MutableLong318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong318");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((java.lang.Number) 10.0f);
        int int5 = mutableLong1.intValue();
        byte byte6 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void MutableLong319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong319");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.add((long) 19);
        java.lang.Class<?> wildcardClass8 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableLong320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong320");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong6.decrement();
        mutableLong1.subtract((java.lang.Number) mutableLong6);
        java.lang.Class<?> wildcardClass9 = mutableLong6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong321");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.add((long) (byte) -57);
        mutableLong1.increment();
        java.lang.Class<?> wildcardClass6 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void MutableLong322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong322");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((java.lang.Number) 10.0f);
        float float5 = mutableLong1.floatValue();
        java.lang.Long long6 = mutableLong1.toLong();
        java.lang.String str7 = mutableLong1.toString();
        java.lang.Class<?> wildcardClass8 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableLong323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong323");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        mutableLong1.setValue((long) (-99));
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong324");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        java.lang.String str8 = mutableLong1.toString();
        java.lang.Class<?> wildcardClass9 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-99" + "'", str8.equals("-99"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong325");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double7 = mutableLong0.doubleValue();
        java.lang.Long long8 = mutableLong0.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-10.0d) + "'", double7 == (-10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10L) + "'", long8.equals((-10L)));
    }

    @Test
    public void MutableLong326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong326");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.subtract((long) (short) 10);
        mutableLong1.decrement();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong327");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 100);
        float float2 = mutableLong1.floatValue();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableLong328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong328");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        java.lang.Long long3 = mutableLong1.toLong();
        java.lang.Class<?> wildcardClass4 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void MutableLong329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong329");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        mutableLong1.setValue((long) (short) -99);
        java.lang.Long long4 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4.equals((-99L)));
    }

    @Test
    public void MutableLong330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong330");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        byte byte8 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -99 + "'", byte8 == (byte) -99);
    }

    @Test
    public void MutableLong331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong331");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        float float2 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void MutableLong332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong332");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.add(10L);
        java.lang.Class<?> wildcardClass8 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableLong333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong333");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((java.lang.Number) 10.0f);
        int int5 = mutableLong1.intValue();
        float float6 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableLong334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong334");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        long long6 = mutableLong1.longValue();
        int int7 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void MutableLong335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong335");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-2");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong();
        long long3 = mutableLong2.longValue();
        mutableLong2.setValue((java.lang.Number) 100.0f);
        double double6 = mutableLong2.doubleValue();
        mutableLong1.setValue((java.lang.Number) mutableLong2);
        java.lang.Class<?> wildcardClass8 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableLong336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong336");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("10");
        mutableLong1.setValue(9L);
    }

    @Test
    public void MutableLong337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong337");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        mutableLong1.add(0L);
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong338");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 100);
        int int2 = mutableLong1.intValue();
        java.lang.Long long3 = mutableLong1.getValue();
        mutableLong1.add((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3.equals(100L));
    }

    @Test
    public void MutableLong339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong339");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong6);
        int int8 = mutableLong1.compareTo(mutableLong7);
        int int9 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void MutableLong340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong340");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.increment();
        mutableLong0.add((java.lang.Number) (short) -1);
    }

    @Test
    public void MutableLong341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong341");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        int int4 = mutableLong0.intValue();
        mutableLong0.add(0L);
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99) + "'", int4 == (-99));
    }

    @Test
    public void MutableLong342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong342");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        int int2 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("10");
        mutableLong1.setValue((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableLong343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong343");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.add((long) (short) -1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) (-2));
        mutableLong1.setValue((java.lang.Number) mutableLong6);
        mutableLong1.setValue(56L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void MutableLong344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong344");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong5.subtract((java.lang.Number) (short) 0);
        int int8 = mutableLong1.compareTo(mutableLong5);
        long long9 = mutableLong5.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void MutableLong345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong345");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        java.lang.String str2 = mutableLong0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
    }

    @Test
    public void MutableLong346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong346");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.increment();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void MutableLong347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong347");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong348");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        float float7 = mutableLong1.floatValue();
        mutableLong1.decrement();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void MutableLong349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong349");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.add((long) (byte) -57);
        mutableLong1.increment();
        mutableLong1.add((long) (-99));
        java.lang.Long long8 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-145L) + "'", long8.equals((-145L)));
    }

    @Test
    public void MutableLong350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong350");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.decrement();
        mutableLong0.decrement();
        mutableLong0.subtract((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
    }

    @Test
    public void MutableLong351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong351");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.setValue((long) 10);
        mutableLong1.increment();
        long long5 = mutableLong1.longValue();
        short short6 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11L + "'", long5 == 11L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 11 + "'", short6 == (short) 11);
    }

    @Test
    public void MutableLong352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong352");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        mutableLong1.subtract((long) (byte) -57);
        long long5 = mutableLong1.longValue();
        double double6 = mutableLong1.doubleValue();
        mutableLong1.increment();
        float float8 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 56L + "'", long5 == 56L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 56.0d + "'", double6 == 56.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 57.0f + "'", float8 == 57.0f);
    }

    @Test
    public void MutableLong353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong353");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        float float3 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void MutableLong354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong354");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.decrement();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long7 = mutableLong6.longValue();
        mutableLong0.subtract((java.lang.Number) long7);
        mutableLong0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void MutableLong355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong355");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.subtract((java.lang.Number) (byte) 1);
        mutableLong0.subtract(10L);
    }

    @Test
    public void MutableLong356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong356");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-2");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong();
        long long3 = mutableLong2.longValue();
        mutableLong2.setValue((java.lang.Number) 100.0f);
        double double6 = mutableLong2.doubleValue();
        mutableLong1.setValue((java.lang.Number) mutableLong2);
        mutableLong1.add((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void MutableLong357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong357");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        int int5 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void MutableLong358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong358");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 11);
    }

    @Test
    public void MutableLong359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong359");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong5.subtract((-1L));
        mutableLong5.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void MutableLong360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong360");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        int int2 = mutableLong1.intValue();
        float float3 = mutableLong1.floatValue();
        mutableLong1.increment();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        short short7 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "11" + "'", str5.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6.equals(11L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 11 + "'", short7 == (short) 11);
    }

    @Test
    public void MutableLong361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong361");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str4 = mutableLong3.toString();
        mutableLong3.setValue((long) (byte) 100);
        double double7 = mutableLong3.doubleValue();
        mutableLong0.subtract((java.lang.Number) mutableLong3);
        java.lang.String str9 = mutableLong0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-100" + "'", str9.equals("-100"));
    }

    @Test
    public void MutableLong362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong362");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((java.lang.Number) (byte) -99);
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong363");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        short short6 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableLong364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong364");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        float float7 = mutableLong1.floatValue();
        mutableLong1.decrement();
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -2 + "'", short9 == (short) -2);
    }

    @Test
    public void MutableLong365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong365");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (-1));
        java.lang.Long long5 = mutableLong4.toLong();
        mutableLong1.setValue((java.lang.Number) long5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5.equals((-1L)));
    }

    @Test
    public void MutableLong366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong366");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        float float2 = mutableLong1.floatValue();
        java.lang.String str3 = mutableLong1.toString();
        double double4 = mutableLong1.doubleValue();
        mutableLong1.add((java.lang.Number) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void MutableLong367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong367");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        java.lang.Long long4 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) long4);
        mutableLong5.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
    }

    @Test
    public void MutableLong368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong368");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableLong3.equals(obj4);
        mutableLong3.add((-99L));
        java.lang.String str8 = mutableLong3.toString();
        java.lang.String str9 = mutableLong3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-100" + "'", str8.equals("-100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-100" + "'", str9.equals("-100"));
    }

    @Test
    public void MutableLong369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong369");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 10);
        mutableLong1.add((-2L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-2L));
        java.lang.Long long5 = mutableLong4.toLong();
        java.lang.Long long6 = mutableLong4.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-2L) + "'", long5.equals((-2L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2L) + "'", long6.equals((-2L)));
    }

    @Test
    public void MutableLong370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong370");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        mutableLong1.decrement();
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong371");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("9");
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 9 + "'", byte2 == (byte) 9);
    }

    @Test
    public void MutableLong372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong372");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        mutableLong0.setValue((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void MutableLong373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong373");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Long long3 = mutableLong1.getValue();
        float float4 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3.equals(100L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void MutableLong374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong374");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 19);
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 19 + "'", byte2 == (byte) 19);
    }

    @Test
    public void MutableLong375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong375");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        double double4 = mutableLong0.doubleValue();
        mutableLong0.increment();
        mutableLong0.setValue((-10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void MutableLong376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong376");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        java.lang.Long long8 = mutableLong1.toLong();
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8.equals(1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9.equals(1L));
    }

    @Test
    public void MutableLong377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong377");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.increment();
        mutableLong1.subtract((long) '4');
        long long6 = mutableLong1.longValue();
        mutableLong1.subtract((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-41L) + "'", long6 == (-41L));
    }

    @Test
    public void MutableLong378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong378");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double7 = mutableLong4.doubleValue();
        mutableLong4.decrement();
        byte byte9 = mutableLong4.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 9 + "'", byte9 == (byte) 9);
    }

    @Test
    public void MutableLong379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong379");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        long long7 = mutableLong1.longValue();
        java.lang.Long long8 = mutableLong1.toLong();
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9.equals((-1L)));
    }

    @Test
    public void MutableLong380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong380");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        float float7 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void MutableLong381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong381");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 0);
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
    }

    @Test
    public void MutableLong382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong382");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long5 = mutableLong4.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double8 = mutableLong0.doubleValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) double8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void MutableLong383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong383");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        mutableLong1.add((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2.equals(1L));
    }

    @Test
    public void MutableLong384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong384");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        int int2 = mutableLong0.intValue();
        mutableLong0.subtract((long) (byte) 10);
        mutableLong0.subtract((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void MutableLong385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong385");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("100");
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong386");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((java.lang.Number) 10.0f);
        float float5 = mutableLong1.floatValue();
        java.lang.Long long6 = mutableLong1.toLong();
        java.lang.String str7 = mutableLong1.toString();
        double double8 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void MutableLong387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong387");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        mutableLong1.increment();
        java.lang.String str5 = mutableLong1.toString();
        int int6 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void MutableLong388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong388");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-47));
        java.lang.String str2 = mutableLong1.toString();
        byte byte3 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-47" + "'", str2.equals("-47"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -47 + "'", byte3 == (byte) -47);
    }

    @Test
    public void MutableLong389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong389");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-2");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong();
        long long3 = mutableLong2.longValue();
        mutableLong2.setValue((java.lang.Number) 100.0f);
        double double6 = mutableLong2.doubleValue();
        mutableLong1.setValue((java.lang.Number) mutableLong2);
        int int8 = mutableLong2.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void MutableLong390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong390");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 3);
        boolean boolean3 = mutableLong1.equals((java.lang.Object) (byte) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableLong391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong391");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        java.lang.String str5 = mutableLong1.toString();
        double double6 = mutableLong1.doubleValue();
        double double7 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void MutableLong392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong392");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void MutableLong393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong393");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        mutableLong0.increment();
        mutableLong0.increment();
        mutableLong0.subtract(3L);
        mutableLong0.add((long) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
    }

    @Test
    public void MutableLong394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong394");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        long long1 = mutableLong0.longValue();
        mutableLong0.setValue((java.lang.Number) 100.0f);
        double double4 = mutableLong0.doubleValue();
        java.lang.Class<?> wildcardClass5 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong395");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
    }

    @Test
    public void MutableLong396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong396");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        int int2 = mutableLong1.intValue();
        float float3 = mutableLong1.floatValue();
        mutableLong1.increment();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "11" + "'", str5.equals("11"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6.equals(11L));
    }

    @Test
    public void MutableLong397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong397");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        java.lang.Long long4 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
    }

    @Test
    public void MutableLong398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong398");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.setValue((java.lang.Number) (-97.0d));
        mutableLong1.decrement();
        double double9 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-98.0d) + "'", double9 == (-98.0d));
    }

    @Test
    public void MutableLong399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong399");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        long long1 = mutableLong0.longValue();
        java.lang.Long long2 = mutableLong0.getValue();
        mutableLong0.add((long) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
    }

    @Test
    public void MutableLong400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong400");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 1);
        java.lang.String str7 = mutableLong1.toString();
        int int8 = mutableLong1.intValue();
        java.lang.Class<?> wildcardClass9 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9" + "'", str7.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void MutableLong401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong401");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        float float5 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void MutableLong402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong402");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        int int2 = mutableLong0.intValue();
        java.lang.String str3 = mutableLong0.toString();
        java.lang.Long long4 = mutableLong0.getValue();
        java.lang.Class<?> wildcardClass5 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-1" + "'", str3.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void MutableLong403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong403");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        mutableLong1.setValue((long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong404");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 100);
        float float2 = mutableLong1.floatValue();
        java.lang.String str3 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100" + "'", str3.equals("100"));
    }

    @Test
    public void MutableLong405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong405");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double7 = mutableLong4.doubleValue();
        double double8 = mutableLong4.doubleValue();
        mutableLong4.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void MutableLong406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong406");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        java.lang.Long long5 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.add((java.lang.Number) mutableLong6);
        mutableLong1.subtract(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
    }

    @Test
    public void MutableLong407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong407");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.decrement();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.increment();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void MutableLong408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong408");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        byte byte8 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void MutableLong409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong409");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (-99));
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -99 + "'", short2 == (short) -99);
    }

    @Test
    public void MutableLong410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong410");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long4 = mutableLong3.getValue();
        byte byte5 = mutableLong3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void MutableLong411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong411");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-99");
        mutableLong1.decrement();
        long long3 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-100L) + "'", long3 == (-100L));
    }

    @Test
    public void MutableLong412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong412");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-9L));
    }

    @Test
    public void MutableLong413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong413");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str4 = mutableLong1.toString();
        java.lang.Long long5 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long7 = mutableLong6.toLong();
        double double8 = mutableLong6.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void MutableLong414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong414");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Object obj4 = null;
        boolean boolean5 = mutableLong3.equals(obj4);
        mutableLong3.add((-99L));
        java.lang.String str8 = mutableLong3.toString();
        short short9 = mutableLong3.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-100" + "'", str8.equals("-100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -100 + "'", short9 == (short) -100);
    }

    @Test
    public void MutableLong415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong415");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        java.lang.String str5 = mutableLong1.toString();
        double double6 = mutableLong1.doubleValue();
        mutableLong1.setValue((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "10" + "'", str5.equals("10"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void MutableLong416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong416");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong6.subtract((long) (byte) 2);
        java.lang.String str9 = mutableLong6.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1" + "'", str9.equals("-1"));
    }

    @Test
    public void MutableLong417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong417");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double7 = mutableLong0.doubleValue();
        long long8 = mutableLong0.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-10.0d) + "'", double7 == (-10.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10L) + "'", long8 == (-10L));
    }

    @Test
    public void MutableLong418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong418");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        java.lang.Long long5 = mutableLong4.toLong();
        mutableLong1.add((java.lang.Number) mutableLong4);
        mutableLong4.subtract((long) (short) 98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5.equals((-1L)));
    }

    @Test
    public void MutableLong419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong419");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        float float2 = mutableLong0.floatValue();
        mutableLong0.setValue((java.lang.Number) (-1L));
        java.lang.String str5 = mutableLong0.toString();
        mutableLong0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
    }

    @Test
    public void MutableLong420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong420");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        java.lang.Long long3 = mutableLong1.toLong();
        int int4 = mutableLong1.intValue();
        mutableLong1.increment();
        float float6 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void MutableLong421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong421");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        java.lang.Long long3 = mutableLong1.toLong();
        mutableLong1.setValue((-10L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3.equals((-1L)));
    }

    @Test
    public void MutableLong422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong422");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-100L));
        int int3 = mutableLong2.intValue();
        mutableLong2.add(98L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
    }

    @Test
    public void MutableLong423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong423");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        java.lang.String str3 = mutableLong1.toString();
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void MutableLong424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong424");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.decrement();
        mutableLong0.setValue((java.lang.Number) (-99.0d));
    }

    @Test
    public void MutableLong425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong425");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(100L);
    }

    @Test
    public void MutableLong426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong426");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        long long7 = mutableLong1.longValue();
        java.lang.Class<?> wildcardClass8 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void MutableLong427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong427");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.decrement();
        java.lang.String str7 = mutableLong1.toString();
        float float8 = mutableLong1.floatValue();
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-2" + "'", str7.equals("-2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-2.0f) + "'", float8 == (-2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -2 + "'", short9 == (short) -2);
    }

    @Test
    public void MutableLong428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong428");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        java.lang.String str4 = mutableLong3.toString();
        java.lang.Long long5 = mutableLong3.getValue();
        mutableLong1.subtract((java.lang.Number) long5);
        mutableLong1.subtract(98L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "100" + "'", str4.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5.equals(100L));
    }

    @Test
    public void MutableLong429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong429");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        float float2 = mutableLong1.floatValue();
        long long3 = mutableLong1.longValue();
        mutableLong1.setValue((long) (byte) 58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void MutableLong430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong430");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        double double4 = mutableLong3.doubleValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void MutableLong431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong431");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -99);
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str3 = mutableLong2.toString();
        float float4 = mutableLong2.floatValue();
        mutableLong2.setValue((java.lang.Number) (-1L));
        mutableLong2.add((long) (byte) -99);
        boolean boolean9 = mutableLong1.equals((java.lang.Object) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableLong432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong432");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long7 = mutableLong6.getValue();
        long long8 = mutableLong6.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void MutableLong433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong433");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (short) 98);
        double double4 = mutableLong1.doubleValue();
        mutableLong1.subtract((java.lang.Number) 100.0d);
        java.lang.String str7 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-97.0d) + "'", double4 == (-97.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-197" + "'", str7.equals("-197"));
    }

    @Test
    public void MutableLong434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong434");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong3.setValue((long) (short) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void MutableLong435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong435");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        mutableLong5.subtract((-99L));
        mutableLong5.decrement();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void MutableLong436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong436");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.add((long) (byte) -57);
        int int5 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            int int7 = mutableLong1.compareTo(mutableLong6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-47) + "'", int5 == (-47));
    }

    @Test
    public void MutableLong437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong437");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        int int2 = mutableLong0.intValue();
        mutableLong0.subtract((long) (byte) 10);
        java.lang.String str5 = mutableLong0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-10" + "'", str5.equals("-10"));
    }

    @Test
    public void MutableLong438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong438");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long4 = mutableLong3.getValue();
        mutableLong3.increment();
        byte byte6 = mutableLong3.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void MutableLong439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong439");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        long long7 = mutableLong1.longValue();
        java.lang.Long long8 = mutableLong1.toLong();
        java.lang.String str9 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-1" + "'", str9.equals("-1"));
    }

    @Test
    public void MutableLong440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong440");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.add((java.lang.Number) (-1L));
        java.lang.Long long6 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 19L + "'", long6.equals(19L));
    }

    @Test
    public void MutableLong441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong441");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 1);
        java.lang.String str7 = mutableLong1.toString();
        java.lang.Long long8 = mutableLong1.getValue();
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9" + "'", str7.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8.equals(9L));
    }

    @Test
    public void MutableLong442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong442");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(8L);
        mutableLong1.add((-100L));
    }

    @Test
    public void MutableLong443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong443");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 35);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong444");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        long long2 = mutableLong1.longValue();
        long long3 = mutableLong1.longValue();
        long long4 = mutableLong1.longValue();
        int int5 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void MutableLong445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong445");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        long long6 = mutableLong1.longValue();
        short short7 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void MutableLong446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong446");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        java.lang.Long long4 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong7 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong6);
        int int8 = mutableLong1.compareTo(mutableLong7);
        java.lang.Long long9 = mutableLong7.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9.equals(35L));
    }

    @Test
    public void MutableLong447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong447");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        mutableLong1.subtract((long) 18);
    }

    @Test
    public void MutableLong448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong448");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.Long long6 = mutableLong1.toLong();
        java.lang.Class<?> wildcardClass7 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong449");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        float float4 = mutableLong0.floatValue();
        mutableLong0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void MutableLong450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong450");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (short) 0);
    }

    @Test
    public void MutableLong451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong451");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        mutableLong1.add((long) 10);
        mutableLong1.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void MutableLong452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong452");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.add(10L);
        java.lang.Long long8 = mutableLong1.toLong();
        double double9 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8.equals(9L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
    }

    @Test
    public void MutableLong453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong453");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 1);
        java.lang.String str7 = mutableLong1.toString();
        double double8 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9" + "'", str7.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
    }

    @Test
    public void MutableLong454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong454");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-47");
        int int2 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void MutableLong455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong455");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Long long4 = mutableLong3.getValue();
        mutableLong3.subtract(35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
    }

    @Test
    public void MutableLong456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong456");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 1);
        java.lang.String str7 = mutableLong1.toString();
        java.lang.Long long8 = mutableLong1.getValue();
        long long9 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "9" + "'", str7.equals("9"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9L + "'", long8.equals(9L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9L + "'", long9 == 9L);
    }

    @Test
    public void MutableLong457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong457");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(98L);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong458");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.setValue((long) (short) 90);
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (short) 90);
    }

    @Test
    public void MutableLong459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong459");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        mutableLong1.subtract((long) 19);
        mutableLong1.decrement();
        float float6 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-21.0f) + "'", float6 == (-21.0f));
    }

    @Test
    public void MutableLong460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong460");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        mutableLong1.subtract((long) '4');
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong461");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 10);
        mutableLong1.add((-2L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-2L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long6 = mutableLong5.getValue();
        mutableLong5.decrement();
        float float8 = mutableLong5.floatValue();
        mutableLong4.add((java.lang.Number) float8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void MutableLong462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong462");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.add((long) 19);
        int int8 = mutableLong1.intValue();
        java.lang.Long long9 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 18 + "'", int8 == 18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 18L + "'", long9.equals(18L));
    }

    @Test
    public void MutableLong463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong463");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        double double7 = mutableLong4.doubleValue();
        mutableLong4.decrement();
        short short9 = mutableLong4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 9 + "'", short9 == (short) 9);
    }

    @Test
    public void MutableLong464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong464");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        mutableLong1.increment();
        mutableLong1.add((java.lang.Number) (byte) 19);
    }

    @Test
    public void MutableLong465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong465");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        java.lang.Long long5 = mutableLong1.getValue();
        mutableLong1.add((long) (short) 1);
        mutableLong1.setValue((long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
    }

    @Test
    public void MutableLong466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong466");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        mutableLong0.increment();
        java.lang.Long long4 = mutableLong0.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4.equals(1L));
    }

    @Test
    public void MutableLong467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong467");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        mutableLong1.increment();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.setValue((java.lang.Number) mutableLong5);
        mutableLong5.subtract((java.lang.Number) (short) -21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
    }

    @Test
    public void MutableLong468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong468");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        float float5 = mutableLong1.floatValue();
        mutableLong1.add((-10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void MutableLong469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong469");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        java.lang.Long long5 = mutableLong4.toLong();
        mutableLong1.add((java.lang.Number) mutableLong4);
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-47));
        mutableLong1.setValue((java.lang.Number) mutableLong8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5.equals((-1L)));
    }

    @Test
    public void MutableLong470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong470");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.decrement();
        java.lang.String str7 = mutableLong1.toString();
        int int8 = mutableLong1.intValue();
        short short9 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-2" + "'", str7.equals("-2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -2 + "'", short9 == (short) -2);
    }

    @Test
    public void MutableLong471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong471");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 10);
        mutableLong1.add((-2L));
        java.lang.Long long4 = mutableLong1.getValue();
        mutableLong1.setValue((long) (byte) -1);
        boolean boolean8 = mutableLong1.equals((java.lang.Object) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8L + "'", long4.equals(8L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void MutableLong472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong472");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        short short4 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableLong473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong473");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.String str7 = mutableLong6.toString();
        int int8 = mutableLong6.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void MutableLong474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong474");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        mutableLong0.add((long) (short) 10);
        byte byte5 = mutableLong0.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 11 + "'", byte5 == (byte) 11);
    }

    @Test
    public void MutableLong475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong475");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.increment();
        mutableLong1.subtract((long) '4');
        short short6 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -41 + "'", short6 == (short) -41);
    }

    @Test
    public void MutableLong476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong476");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        int int4 = mutableLong0.intValue();
        mutableLong0.add(0L);
        double double7 = mutableLong0.doubleValue();
        mutableLong0.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99) + "'", int4 == (-99));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-99.0d) + "'", double7 == (-99.0d));
    }

    @Test
    public void MutableLong477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong477");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        short short6 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
    }

    @Test
    public void MutableLong478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong478");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        double double4 = mutableLong1.doubleValue();
        java.lang.Long long5 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong1.add((java.lang.Number) mutableLong6);
        mutableLong6.add(3L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5.equals(1L));
    }

    @Test
    public void MutableLong479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong479");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 1);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong480");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        int int6 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void MutableLong481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong481");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong0);
        java.lang.String str5 = mutableLong4.toString();
        mutableLong4.setValue((long) (byte) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "100" + "'", str5.equals("100"));
    }

    @Test
    public void MutableLong482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong482");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong6.setValue((-2L));
    }

    @Test
    public void MutableLong483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong483");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.setValue((long) 10);
        double double4 = mutableLong1.doubleValue();
        mutableLong1.add((long) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableLong484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong484");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        boolean boolean5 = mutableLong1.equals((java.lang.Object) false);
        mutableLong1.decrement();
        java.lang.String str7 = mutableLong1.toString();
        float float8 = mutableLong1.floatValue();
        long long9 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-2" + "'", str7.equals("-2"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-2.0f) + "'", float8 == (-2.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-2L) + "'", long9 == (-2L));
    }

    @Test
    public void MutableLong485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong485");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.increment();
        mutableLong1.add((long) (byte) 100);
        short short6 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 111 + "'", short6 == (short) 111);
    }

    @Test
    public void MutableLong486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong486");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1L));
        mutableLong1.subtract((long) (byte) 1);
        float float7 = mutableLong1.floatValue();
        mutableLong1.subtract((-36L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 9.0f + "'", float7 == 9.0f);
    }

    @Test
    public void MutableLong487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong487");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((java.lang.Number) (byte) -99);
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong488");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        mutableLong1.add(10L);
        mutableLong1.increment();
        java.lang.String str9 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void MutableLong489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong489");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        int int2 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableLong490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong490");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-10");
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2.equals((-10L)));
    }

    @Test
    public void MutableLong491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong491");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        float float4 = mutableLong1.floatValue();
        java.lang.String str5 = mutableLong1.toString();
        java.lang.String str6 = mutableLong1.toString();
        long long7 = mutableLong1.longValue();
        int int8 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-1" + "'", str5.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-1" + "'", str6.equals("-1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void MutableLong492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong492");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        mutableLong0.increment();
        float float5 = mutableLong0.floatValue();
        double double6 = mutableLong0.doubleValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong(19L);
        int int9 = mutableLong0.compareTo(mutableLong8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-98.0f) + "'", float5 == (-98.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-98.0d) + "'", double6 == (-98.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void MutableLong493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong493");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-99");
        mutableLong1.add((long) (byte) 19);
    }

    @Test
    public void MutableLong494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong494");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.add((java.lang.Number) (-99.0d));
        mutableLong0.increment();
        mutableLong0.increment();
        mutableLong0.subtract((long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
    }

    @Test
    public void MutableLong495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong495");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        float float4 = mutableLong0.floatValue();
        float float5 = mutableLong0.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void MutableLong496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong496");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 1);
        mutableLong1.decrement();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 1);
        mutableLong1.subtract((java.lang.Number) (short) 1);
    }

    @Test
    public void MutableLong497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong497");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        mutableLong0.setValue((long) (byte) 100);
        double double4 = mutableLong0.doubleValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong();
        long long6 = mutableLong5.longValue();
        java.lang.Long long7 = mutableLong5.getValue();
        int int8 = mutableLong0.compareTo(mutableLong5);
        java.lang.String str9 = mutableLong5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void MutableLong498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong498");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        java.lang.Long long2 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) mutableLong4);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2.equals(10L));
    }

    @Test
    public void MutableLong499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong499");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        java.lang.Number number3 = null;
        // The following exception was thrown during execution in MutableLong generation
        try {
            mutableLong0.subtract(number3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
    }

    @Test
    public void MutableLong500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.MutableLong500");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long5 = mutableLong4.longValue();
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.Long long7 = mutableLong4.toLong();
        short short8 = mutableLong4.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7.equals(10L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
    }
}

