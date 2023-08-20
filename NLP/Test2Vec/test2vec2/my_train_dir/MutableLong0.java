
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
            System.out.format("%n%s%n", "MutableLong0.test001");
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
            System.out.format("%n%s%n", "MutableLong0.test002");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test003");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test004");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test005");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test006");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.setValue((long) (short) 100);
        byte byte4 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test007");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test008");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test009");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test010");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test011");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test012");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        mutableLong1.add(1L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test013");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        java.lang.Class<?> wildcardClass2 = mutableLong0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test014");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test015");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test016");
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
            System.out.format("%n%s%n", "MutableLong0.test017");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test018");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test019");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        short short3 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test020");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test021");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test022");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test023");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test024");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        byte byte7 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 2 + "'", byte7 == (byte) 2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test025");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test026");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test027");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test028");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        long long1 = mutableLong0.longValue();
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test029");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test030");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test031");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test032");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        java.lang.Long long2 = mutableLong1.toLong();
        short short3 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test033");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test034");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        java.lang.Long long2 = mutableLong1.toLong();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2.equals((-1L)));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test035");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test036");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((long) (-1));
        mutableLong1.subtract((-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test037");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test038");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test039");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.add((java.lang.Number) (-1L));
        long long6 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 19L + "'", long6 == 19L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test040");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test041");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test042");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test043");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test044");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test045");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((long) (-1));
        mutableLong1.add((long) (byte) 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test046");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test047");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test048");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        int int2 = mutableLong0.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long5 = mutableLong4.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        mutableLong0.subtract((java.lang.Number) mutableLong4);
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test049");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test050");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test051");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test052");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test053");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 0);
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test054");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test055");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test056");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test057");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test058");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test059");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test060");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test061");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test062");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test063");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test064");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test065");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test066");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        java.lang.Class<?> wildcardClass7 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test067");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("1");
        mutableLong1.increment();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test068");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        float float2 = mutableLong1.floatValue();
        byte byte3 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test069");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test070");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (short) 98);
        mutableLong1.add((long) (short) 100);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test071");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test072");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test073");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test074");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test075");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test076");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test077");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        double double4 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test078");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test079");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test080");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test081");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test082");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -99);
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -99 + "'", byte2 == (byte) -99);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test083");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test084");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test085");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test086");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test087");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test088");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test089");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test090");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test091");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test092");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test093");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test094");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test095");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test096");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test097");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test098");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test099");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        byte byte3 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test100");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test101");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        int int2 = mutableLong0.intValue();
        mutableLong0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test102");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        java.lang.String str2 = mutableLong1.toString();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "100" + "'", str2.equals("100"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test103");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test104");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test105");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test106");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test107");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test108");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test109");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test110");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test111");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test112");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test113");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test114");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test115");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.setValue((long) (short) 100);
        short short4 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test116");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test117");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test118");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 0);
        java.lang.Number number2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableLong1.add(number2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test119");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test120");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test121");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -57);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test122");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        java.lang.Long long8 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-99L) + "'", long8.equals((-99L)));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test123");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test124");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        boolean boolean9 = mutableLong1.equals((java.lang.Object) "100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test125");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test126");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        float float3 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test127");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test128");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) -99);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test129");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        float float2 = mutableLong1.floatValue();
        mutableLong1.subtract((java.lang.Number) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test130");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test131");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        java.lang.Long long2 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2.equals(100L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test132");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test133");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test134");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test135");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.subtract((long) (short) 9);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test136");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test137");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test138");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test139");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test140");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test141");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        java.lang.Class<?> wildcardClass7 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test142");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.subtract((long) (short) 98);
        double double4 = mutableLong1.doubleValue();
        java.lang.Number number5 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test143");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test144");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test145");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -100 + "'", byte2 == (byte) -100);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test146");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test147");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test148");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test149");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test150");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test151");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test152");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test153");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong6.add((long) (byte) 100);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test154");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test155");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test156");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test157");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test158");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test159");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test160");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test161");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 100);
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test162");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        double double2 = mutableLong1.doubleValue();
        short short3 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test163");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test164");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.setValue((long) 10);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test165");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test166");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test167");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test168");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test169");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) ' ');
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test170");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test171");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test172");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test173");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test174");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test175");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test176");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test177");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("10");
        mutableLong1.subtract((long) (-47));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test178");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test179");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test180");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test181");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test182");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test183");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test184");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test185");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test186");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test187");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test188");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test189");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test190");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test191");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(number0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test192");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test193");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test194");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        int int2 = mutableLong1.intValue();
        boolean boolean4 = mutableLong1.equals((java.lang.Object) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test195");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test196");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test197");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 10);
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2.equals(10L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test198");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        float float3 = mutableLong2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test199");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test200");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test201");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test202");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test203");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test204");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test205");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.increment();
        mutableLong1.increment();
        mutableLong1.subtract(0L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test206");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test207");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test208");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test209");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        mutableLong1.setValue((java.lang.Number) (-10.0d));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test210");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        double double2 = mutableLong1.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test211");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test212");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test213");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test214");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(10L);
        mutableLong1.increment();
        mutableLong1.increment();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test215");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        int int2 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test216");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test217");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test218");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 10);
        mutableLong1.increment();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test219");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        mutableLong1.setValue((long) 'a');
        mutableLong1.setValue(9L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test220");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test221");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test222");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test223");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        mutableLong1.add((long) 'a');
        mutableLong1.setValue((long) 35);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test224");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test225");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.decrement();
        short short5 = mutableLong0.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -2 + "'", short5 == (short) -2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test226");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test227");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test228");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test229");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test230");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 1);
        java.lang.Long long2 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2.equals(1L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test231");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        byte byte3 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test232");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test233");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test234");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test235");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test236");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.decrement();
        java.lang.Number number4 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test237");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test238");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test239");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-10L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test240");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong1.subtract((long) 0);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test241");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test242");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.setValue((long) 10);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = mutableLong1.compareTo(mutableLong4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test243");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.decrement();
        double double5 = mutableLong0.doubleValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-2.0d) + "'", double5 == (-2.0d));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test244");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test245");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test246");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test247");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test248");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test249");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test250");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        mutableLong1.setValue((long) (-99));
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test251");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test252");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test253");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test254");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 100);
        int int2 = mutableLong1.intValue();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test255");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2.equals(10L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test256");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test257");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        java.lang.String str4 = mutableLong1.toString();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test258");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test259");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test260");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test261");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test262");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test263");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test264");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test265");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.Long long2 = mutableLong1.getValue();
        mutableLong1.add((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2.equals(1L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test266");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test267");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test268");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test269");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test270");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test271");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test272");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test273");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.add((java.lang.Number) (-1L));
        mutableLong1.add((java.lang.Number) 0.0f);
        mutableLong1.setValue((long) (short) 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test274");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test275");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test276");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        mutableLong1.add((long) (-47));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test277");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test278");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test279");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test280");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test281");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test282");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("11");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong3.increment();
        mutableLong1.setValue((java.lang.Number) mutableLong3);
        mutableLong1.increment();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test283");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(10L);
        mutableLong1.decrement();
        org.apache.commons.lang3.mutable.MutableLong mutableLong9 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test284");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test285");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test286");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test287");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 0);
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test288");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test289");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test290");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test291");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test292");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test293");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test294");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test295");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test296");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test297");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        java.lang.Class<?> wildcardClass3 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test298");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(0L);
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        float float3 = mutableLong2.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test299");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test300");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.subtract(0L);
        byte byte6 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test301");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test302");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 9);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test303");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test304");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test305");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        mutableLong1.setValue((long) (byte) -1);
        byte byte4 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test306");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test307");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong2.subtract((long) 0);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test308");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test309");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test310");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        int int4 = mutableLong1.intValue();
        double double5 = mutableLong1.doubleValue();
        java.lang.String str6 = mutableLong1.toString();
        mutableLong1.decrement();
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test311");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test312");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test313");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (short) 90);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test314");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test315");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test316");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test317");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test318");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test319");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test320");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test321");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test322");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test323");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        mutableLong1.setValue((long) (-99));
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test324");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test325");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test326");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test327");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 100);
        float float2 = mutableLong1.floatValue();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test328");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test329");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        mutableLong1.setValue((long) (short) -99);
        java.lang.Long long4 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-99L) + "'", long4.equals((-99L)));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test330");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        byte byte8 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -99 + "'", byte8 == (byte) -99);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test331");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        float float2 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-100.0f) + "'", float2 == (-100.0f));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test332");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test333");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test334");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test335");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test336");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("10");
        mutableLong1.setValue(9L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test337");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test338");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test339");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test340");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.increment();
        mutableLong0.add((java.lang.Number) (short) -1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test341");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test342");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(10L);
        int int2 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("10");
        mutableLong1.setValue((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test343");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test344");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test345");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.String str1 = mutableLong0.toString();
        java.lang.String str2 = mutableLong0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0" + "'", str2.equals("0"));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test346");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        long long2 = mutableLong1.longValue();
        mutableLong1.increment();
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test347");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test348");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test349");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test350");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.decrement();
        mutableLong0.decrement();
        mutableLong0.subtract((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1.equals(0L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test351");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test352");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test353");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-1L));
        long long2 = mutableLong1.longValue();
        float float3 = mutableLong1.floatValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test354");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test355");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.subtract((java.lang.Number) (byte) 1);
        mutableLong0.subtract(10L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test356");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test357");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test358");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 11);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test359");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test360");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test361");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test362");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((java.lang.Number) (byte) -99);
        mutableLong1.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test363");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        short short6 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test364");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test365");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) '#');
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (-1));
        java.lang.Long long5 = mutableLong4.toLong();
        mutableLong1.setValue((java.lang.Number) long5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5.equals((-1L)));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test366");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test367");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        java.lang.Long long4 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong5 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) long4);
        mutableLong5.increment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test368");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test369");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test370");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test371");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("9");
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 9 + "'", byte2 == (byte) 9);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test372");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test373");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test374");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 19);
        byte byte2 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 19 + "'", byte2 == (byte) 19);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test375");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test376");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test377");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test378");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test379");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test380");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test381");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (byte) 0);
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2.equals(0L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test382");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test383");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        java.lang.Long long2 = mutableLong1.getValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong(1L);
        mutableLong1.add((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2.equals(1L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test384");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test385");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("100");
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test386");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test387");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test388");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-47));
        java.lang.String str2 = mutableLong1.toString();
        byte byte3 = mutableLong1.byteValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "-47" + "'", str2.equals("-47"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -47 + "'", byte3 == (byte) -47);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test389");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test390");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 3);
        boolean boolean3 = mutableLong1.equals((java.lang.Object) (byte) -100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test391");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test392");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test393");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test394");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test395");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test396");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test397");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        java.lang.Long long4 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4.equals(0L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test398");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test399");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test400");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test401");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test402");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test403");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test404");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 100);
        float float2 = mutableLong1.floatValue();
        java.lang.String str3 = mutableLong1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "100" + "'", str3.equals("100"));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test405");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test406");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test407");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test408");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test409");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (-99));
        short short2 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -99 + "'", short2 == (short) -99);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test410");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test411");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-99");
        mutableLong1.decrement();
        long long3 = mutableLong1.longValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-100L) + "'", long3 == (-100L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test412");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-9L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test413");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test414");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test415");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test416");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test417");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test418");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test419");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test420");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test421");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test422");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((-100L));
        org.apache.commons.lang3.mutable.MutableLong mutableLong2 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (-100L));
        int int3 = mutableLong2.intValue();
        mutableLong2.add(98L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test423");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test424");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        mutableLong0.decrement();
        mutableLong0.setValue((java.lang.Number) (-99.0d));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test425");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(100L);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test426");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test427");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test428");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test429");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test430");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test431");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test432");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test433");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test434");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -1);
        long long2 = mutableLong1.longValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong3.setValue((long) (short) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test435");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test436");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        float float2 = mutableLong1.floatValue();
        mutableLong1.add((long) (byte) -57);
        int int5 = mutableLong1.intValue();
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test437");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test438");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test439");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test440");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        mutableLong1.add((long) 10);
        mutableLong1.add((java.lang.Number) (-1L));
        java.lang.Long long6 = mutableLong1.getValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 19L + "'", long6.equals(19L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test441");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test442");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(8L);
        mutableLong1.add((-100L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test443");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 35);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test444");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test445");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test446");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test447");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.subtract(100L);
        mutableLong1.subtract((long) 18);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test448");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test449");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        mutableLong0.decrement();
        mutableLong0.add((java.lang.Number) 0);
        float float4 = mutableLong0.floatValue();
        mutableLong0.decrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test450");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.subtract((java.lang.Number) (short) 0);
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (short) 0);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test451");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test452");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test453");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test454");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-47");
        int int2 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-47) + "'", int2 == (-47));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test455");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test456");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test457");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong(98L);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test458");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        mutableLong1.setValue((long) (short) 90);
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (short) 90);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test459");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test460");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        org.apache.commons.lang3.mutable.MutableLong mutableLong3 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong3.subtract((java.lang.Number) (short) 0);
        mutableLong1.add((java.lang.Number) (short) 0);
        mutableLong1.subtract((long) '4');
        mutableLong1.decrement();
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test461");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test462");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test463");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test464");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-1");
        mutableLong1.increment();
        mutableLong1.add((java.lang.Number) (byte) 19);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test465");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test466");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test467");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test468");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test469");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test470");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test471");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test472");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        short short4 = mutableLong1.shortValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test473");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test474");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test475");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test476");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test477");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test478");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test479");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 1);
        java.lang.Class<?> wildcardClass2 = mutableLong1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test480");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test481");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test482");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) 10.0f);
        mutableLong1.setValue((long) (byte) 1);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong1);
        mutableLong6.setValue((-2L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test483");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) 1.0d);
        mutableLong1.setValue((long) 10);
        double double4 = mutableLong1.doubleValue();
        mutableLong1.add((long) (byte) 11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test484");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test485");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test486");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test487");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) (byte) 1);
        boolean boolean5 = mutableLong1.equals((java.lang.Object) 10L);
        mutableLong1.setValue((java.lang.Number) (byte) -99);
        org.apache.commons.lang3.mutable.MutableLong mutableLong8 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) (byte) -99);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test488");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test489");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 100);
        int int2 = mutableLong1.intValue();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test490");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-10");
        java.lang.Long long2 = mutableLong1.toLong();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2.equals((-10L)));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test491");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test492");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test493");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong("-99");
        mutableLong1.add((long) (byte) 19);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test494");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test495");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test496");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) 1);
        mutableLong1.decrement();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 1);
        mutableLong1.subtract((java.lang.Number) (short) 1);
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test497");
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test498");
        org.apache.commons.lang3.mutable.MutableLong mutableLong1 = new org.apache.commons.lang3.mutable.MutableLong((long) (short) 10);
        java.lang.Long long2 = mutableLong1.toLong();
        org.apache.commons.lang3.mutable.MutableLong mutableLong4 = new org.apache.commons.lang3.mutable.MutableLong("0");
        mutableLong1.add((java.lang.Number) mutableLong4);
        org.apache.commons.lang3.mutable.MutableLong mutableLong6 = new org.apache.commons.lang3.mutable.MutableLong((java.lang.Number) mutableLong4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2.equals(10L));
    }

    @Test
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test499");
        org.apache.commons.lang3.mutable.MutableLong mutableLong0 = new org.apache.commons.lang3.mutable.MutableLong();
        java.lang.Long long1 = mutableLong0.getValue();
        mutableLong0.increment();
        java.lang.Number number3 = null;
        // The following exception was thrown during execution in test generation
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
    public void MutableLong() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MutableLong0.test500");
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

