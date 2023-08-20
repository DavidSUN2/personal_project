package TimedSemaphore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimedSemaphore2 {

    public static boolean debug = false;

    @Test
    public void TimedSemaphore1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1001");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 0);
        int int4 = timedSemaphore3.getAcquireCount();
        long long5 = timedSemaphore3.getPeriod();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1002");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(10L, timeUnit1, 100);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1003");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        int int8 = timedSemaphore4.getAvailablePermits();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void TimedSemaphore1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1004");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (byte) 1);
        int int5 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void TimedSemaphore1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1005");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1006");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 0, timeUnit2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1007");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1008");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        long long8 = timedSemaphore3.getPeriod();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1009");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1010");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.setLimit((int) (short) 1);
        int int7 = timedSemaphore4.getLimit();
        int int8 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1011");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 0);
        int int4 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1012");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1013");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (short) -1);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1014");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getAcquireCount();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1015");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1016");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean6 = timedSemaphore4.isShutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1017");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (int) (short) 0);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1018");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getLimit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void TimedSemaphore1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1019");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1020");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAvailablePermits();
        long long8 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1021");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) -1, timeUnit1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1022");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (byte) -1);
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1023");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1024");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1025");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 0, timeUnit2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1026");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.setLimit((int) (short) 1);
        int int7 = timedSemaphore4.getLimit();
        int int8 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1027");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        int int7 = timedSemaphore3.getAcquireCount();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1028");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (int) (byte) -1);
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1029");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        long long6 = timedSemaphore4.getPeriod();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void TimedSemaphore1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1030");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(32L, timeUnit1, (int) (short) 100);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1031");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 0);
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void TimedSemaphore1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1032");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) 'a');
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1033");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1034");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1035");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1036");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) -1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1037");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAvailablePermits();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1038");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.setLimit((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1039");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore4.getLimit();
        int int8 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void TimedSemaphore1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1040");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, 52);
    }

    @Test
    public void TimedSemaphore1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1041");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1042");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) -1, timeUnit1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1043");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) ' ', timeUnit1, (int) '4');
        timedSemaphore3.setLimit((int) (byte) 100);
        timedSemaphore3.setLimit((int) (short) 100);
    }

    @Test
    public void TimedSemaphore1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1044");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (short) -1);
        int int5 = timedSemaphore4.getLimit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void TimedSemaphore1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1045");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((-1L), timeUnit1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1046");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1047");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (int) (byte) 100);
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void TimedSemaphore1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1048");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLimit();
        boolean boolean7 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1049");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(52L, timeUnit1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1050");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1051");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1052");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLimit();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1053");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, (int) (short) 10);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1054");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getLimit();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1055");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.setLimit((int) (short) 1);
        long long7 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void TimedSemaphore1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1056");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1057");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 0, timeUnit2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1058");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLimit();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1059");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1060");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, 52);
    }

    @Test
    public void TimedSemaphore1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1061");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, (int) (short) -1);
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) 'a');
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void TimedSemaphore1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1062");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, (int) (byte) 0);
    }

    @Test
    public void TimedSemaphore1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1063");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1064");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getLimit();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1065");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, 10);
    }

    @Test
    public void TimedSemaphore1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1066");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 1);
        int int4 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        int int6 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1067");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) (byte) -1);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void TimedSemaphore1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1068");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAvailablePermits();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.setLimit((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void TimedSemaphore1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1069");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 97);
    }

    @Test
    public void TimedSemaphore1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1070");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        long long7 = timedSemaphore4.getPeriod();
        int int8 = timedSemaphore4.getLastAcquiresPerPeriod();
        boolean boolean9 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1071");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        int int6 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void TimedSemaphore1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1072");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (int) '#');
        timedSemaphore3.setLimit((int) (short) 0);
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void TimedSemaphore1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1073");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) ' ');
        int int4 = timedSemaphore3.getLimit();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void TimedSemaphore1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1074");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAcquireCount();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1075");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '4', timeUnit2, (int) ' ');
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void TimedSemaphore1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1076");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        int int7 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1077");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        timedSemaphore3.setLimit(1);
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1078");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(32L, timeUnit1, (int) (byte) 100);
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1079");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1080");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1081");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) -1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void TimedSemaphore1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1082");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1083");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 10, timeUnit1, 100);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void TimedSemaphore1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1084");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (int) '#');
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        int int6 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void TimedSemaphore1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1085");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1086");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) ' ');
        timedSemaphore3.setLimit((int) (short) 100);
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1087");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void TimedSemaphore1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1088");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) (short) 10);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1089");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            java.lang.Class<?> wildcardClass9 = timeUnit8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1090");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1091");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        int int8 = timedSemaphore4.getAvailablePermits();
        long long9 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void TimedSemaphore1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1092");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getLimit();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1093");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 1);
        timedSemaphore3.shutdown();
        int int5 = timedSemaphore3.getLimit();
        timedSemaphore3.setLimit((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void TimedSemaphore1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1094");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 100);
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1095");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) ' ');
        int int4 = timedSemaphore3.getLimit();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void TimedSemaphore1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1096");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAcquireCount();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1097");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        timedSemaphore4.setLimit((int) 'a');
        java.lang.Class<?> wildcardClass8 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1098");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAvailablePermits();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1099");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) (short) 0);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1100");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore4.getLimit();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void TimedSemaphore1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1101");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 32, timeUnit2, (int) '#');
    }

    @Test
    public void TimedSemaphore1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1102");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, 97);
    }

    @Test
    public void TimedSemaphore1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1103");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        boolean boolean7 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1104");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, (int) (byte) 1);
    }

    @Test
    public void TimedSemaphore1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1105");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1106");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, (int) (short) 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1107");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1108");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        int int5 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1109");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit((int) (short) 1);
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1110");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) ' ');
    }

    @Test
    public void TimedSemaphore1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1111");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1112");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 97, timeUnit1, (int) (short) 0);
    }

    @Test
    public void TimedSemaphore1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1113");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(32L, timeUnit1, (int) (short) 100);
        timedSemaphore3.setLimit((int) (byte) 10);
    }

    @Test
    public void TimedSemaphore1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1114");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        int int7 = timedSemaphore4.getLimit();
        boolean boolean8 = timedSemaphore4.isShutdown();
        long long9 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void TimedSemaphore1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1115");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) ' ');
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        int int5 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void TimedSemaphore1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1116");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 1, timeUnit2, 0);
        int int5 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1117");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        int int7 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1118");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 32);
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1119");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 0, timeUnit2, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1120");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit(52);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1121");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 10, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void TimedSemaphore1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1122");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 0, timeUnit1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1123");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) (short) 0);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1124");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1125");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void TimedSemaphore1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1126");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '4', timeUnit2, (int) ' ');
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        timedSemaphore4.setLimit((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void TimedSemaphore1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1127");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) -1);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1128");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void TimedSemaphore1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1129");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) (short) 1);
        timedSemaphore3.setLimit(1);
    }

    @Test
    public void TimedSemaphore1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1130");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getAcquireCount();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1131");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, 35);
    }

    @Test
    public void TimedSemaphore1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1132");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore2.TimedSemaphore1133");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, 0);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }
}

