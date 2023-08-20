package TimedSemaphore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimedSemaphore1 {

    public static boolean debug = false;

    @Test
    public void TimedSemaphore0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0501");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 10);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0502");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0503");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0504");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0505");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        long long7 = timedSemaphore3.getPeriod();
        int int8 = timedSemaphore3.getLimit();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0506");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 100);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0507");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0508");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, (int) '4');
        timedSemaphore4.shutdown();
        boolean boolean6 = timedSemaphore4.isShutdown();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0509");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0510");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean6 = timedSemaphore4.isShutdown();
        timedSemaphore4.shutdown();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0511");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        boolean boolean8 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0512");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) (short) 10);
        int int5 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void TimedSemaphore0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0513");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0514");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (-1L), timeUnit2, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0515");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0516");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 0, timeUnit2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0517");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        timedSemaphore3.setLimit(100);
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0518");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0519");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0520");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getLimit();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0521");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0522");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void TimedSemaphore0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0523");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '#', timeUnit1, (int) (byte) 1);
        int int4 = timedSemaphore3.getAvailablePermits();
        long long5 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void TimedSemaphore0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0524");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        timedSemaphore4.setLimit(10);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0525");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getLimit();
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
    public void TimedSemaphore0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0526");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 1);
    }

    @Test
    public void TimedSemaphore0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0527");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLimit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0528");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, 52);
        timedSemaphore4.shutdown();
    }

    @Test
    public void TimedSemaphore0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0529");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, 52);
        int int4 = timedSemaphore3.getLimit();
        int int5 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void TimedSemaphore0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0530");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void TimedSemaphore0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0531");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getLimit();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0532");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 1, timeUnit2, 0);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0533");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0534");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, 32);
    }

    @Test
    public void TimedSemaphore0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0535");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        long long6 = timedSemaphore4.getPeriod();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass8 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0536");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean6 = timedSemaphore4.isShutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        boolean boolean8 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0537");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        long long8 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0538");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, 10);
    }

    @Test
    public void TimedSemaphore0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0539");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, (int) '4');
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0540");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, 1);
    }

    @Test
    public void TimedSemaphore0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0541");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAcquireCount();
        long long8 = timedSemaphore3.getPeriod();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0542");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0543");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) ' ');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0544");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0545");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void TimedSemaphore0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0546");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getAvailablePermits();
        long long8 = timedSemaphore4.getPeriod();
        double double9 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0547");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0548");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0549");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0550");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) -1, timeUnit2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0551");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0552");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0553");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        long long7 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void TimedSemaphore0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0554");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0555");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLimit();
        timedSemaphore3.shutdown();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0556");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0557");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0558");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (-1L), timeUnit2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0559");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void TimedSemaphore0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0560");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, (int) (short) 1);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0561");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0562");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 0);
        boolean boolean4 = timedSemaphore3.isShutdown();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        long long6 = timedSemaphore3.getPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void TimedSemaphore0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0563");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLimit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        long long9 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void TimedSemaphore0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0564");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0565");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAcquireCount();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0566");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getLimit();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0567");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 52);
    }

    @Test
    public void TimedSemaphore0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0568");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0569");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, 10);
    }

    @Test
    public void TimedSemaphore0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0570");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) ' ');
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void TimedSemaphore0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0571");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0572");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAcquireCount();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0573");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        double double9 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0574");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0575");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0576");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0577");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.setLimit(1);
        boolean boolean8 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0578");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 0, timeUnit2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0579");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (int) '#');
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        long long6 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void TimedSemaphore0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0580");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0581");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        java.lang.Class<?> wildcardClass8 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0582");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        int int7 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0583");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getLimit();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0584");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, (int) '4');
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void TimedSemaphore0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0585");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        int int8 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0586");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0587");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, 1);
    }

    @Test
    public void TimedSemaphore0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0588");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) '#');
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0589");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0590");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAvailablePermits();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0591");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0592");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0593");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 100);
        timedSemaphore3.setLimit((int) (short) -1);
    }

    @Test
    public void TimedSemaphore0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0594");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 0, timeUnit2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0595");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        int int7 = timedSemaphore4.getAvailablePermits();
        int int8 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void TimedSemaphore0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0596");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0597");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(10L, timeUnit1, (int) (short) 0);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void TimedSemaphore0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0598");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0599");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0600");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((-1L), timeUnit1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0601");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getLimit();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0602");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) (short) 1);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0603");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        boolean boolean8 = timedSemaphore3.isShutdown();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0604");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0605");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (int) (short) 0);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0606");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '4');
    }

    @Test
    public void TimedSemaphore0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0607");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 32);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0608");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0609");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
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
    public void TimedSemaphore0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0610");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0611");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0612");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, 0);
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0613");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) -1);
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        int int5 = timedSemaphore3.getLimit();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0614");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
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
    public void TimedSemaphore0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0615");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0616");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '#');
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        long long7 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void TimedSemaphore0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0617");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void TimedSemaphore0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0618");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0619");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLimit();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0620");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0621");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.shutdown();
        long long7 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void TimedSemaphore0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0622");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 0);
        int int4 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0623");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) '#');
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.setLimit((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void TimedSemaphore0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0624");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        boolean boolean6 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0625");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.shutdown();
        timedSemaphore4.shutdown();
        long long8 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void TimedSemaphore0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0626");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 100);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void TimedSemaphore0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0627");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 0);
        int int4 = timedSemaphore3.getAvailablePermits();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0628");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void TimedSemaphore0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0629");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (-1L), timeUnit2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0630");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, (-1));
    }

    @Test
    public void TimedSemaphore0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0631");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0632");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 100);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0633");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) '4');
    }

    @Test
    public void TimedSemaphore0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0634");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) (short) 100);
        timedSemaphore4.setLimit(1);
    }

    @Test
    public void TimedSemaphore0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0635");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 52, timeUnit1, 52);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0636");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        long long8 = timedSemaphore3.getPeriod();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0637");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
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
    public void TimedSemaphore0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0638");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0639");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (-1));
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0640");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(32L, timeUnit1, 32);
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void TimedSemaphore0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0641");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) 'a');
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0642");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getLimit();
        timedSemaphore3.setLimit(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0643");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (byte) -1);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0644");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0645");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0646");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, (int) (short) -1);
        timedSemaphore4.setLimit((int) ' ');
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        long long8 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void TimedSemaphore0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0647");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((-1L), timeUnit1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0648");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        int int8 = timedSemaphore4.getAvailablePermits();
        boolean boolean9 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0649");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLimit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            java.lang.Class<?> wildcardClass9 = timeUnit8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0650");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        int int7 = timedSemaphore4.getAvailablePermits();
        boolean boolean8 = timedSemaphore4.isShutdown();
        int int9 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void TimedSemaphore0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0651");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        long long7 = timedSemaphore4.getPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        double double9 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0652");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0653");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAcquireCount();
        int int8 = timedSemaphore3.getAvailablePermits();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0654");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0655");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        timedSemaphore4.shutdown();
        boolean boolean6 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void TimedSemaphore0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0656");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            java.lang.Class<?> wildcardClass8 = timeUnit7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0657");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 32, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (short) 100);
    }

    @Test
    public void TimedSemaphore0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0658");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAcquireCount();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void TimedSemaphore0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0659");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0660");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (int) '#');
    }

    @Test
    public void TimedSemaphore0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0661");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0662");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) -1);
    }

    @Test
    public void TimedSemaphore0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0663");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(32L, timeUnit1, (int) (byte) 100);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0664");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) -1, timeUnit2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0665");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        long long7 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void TimedSemaphore0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0666");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.shutdown();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0667");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0668");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 1, timeUnit2, 0);
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0669");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) ' ');
        timedSemaphore3.setLimit((int) (byte) 100);
        timedSemaphore3.setLimit((int) (short) 0);
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0670");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) '#');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0671");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 1, timeUnit2, (int) (short) 0);
    }

    @Test
    public void TimedSemaphore0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0672");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 1L, timeUnit2, (int) (byte) 1);
    }

    @Test
    public void TimedSemaphore0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0673");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        int int6 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0674");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 10);
        timedSemaphore4.setLimit((int) 'a');
    }

    @Test
    public void TimedSemaphore0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0675");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0676");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0677");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 100);
        boolean boolean5 = timedSemaphore4.isShutdown();
        boolean boolean6 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0678");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit((int) (byte) 100);
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0679");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        timedSemaphore3.setLimit((int) 'a');
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0680");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getAvailablePermits();
        long long8 = timedSemaphore4.getPeriod();
        int int9 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0681");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLimit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        timedSemaphore4.setLimit((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0682");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) '#');
        boolean boolean5 = timedSemaphore4.isShutdown();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0683");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0684");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        timedSemaphore3.setLimit((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0685");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (short) 10);
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void TimedSemaphore0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0686");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        long long8 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0687");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 1);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0688");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit((int) (short) 0);
        int int7 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0689");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0690");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 1, timeUnit2, 0);
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void TimedSemaphore0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0691");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getLimit();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0692");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAcquireCount();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0693");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(97L, timeUnit1, (int) (short) 100);
    }

    @Test
    public void TimedSemaphore0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0694");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 0);
        boolean boolean4 = timedSemaphore3.isShutdown();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        long long6 = timedSemaphore3.getPeriod();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0695");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        long long8 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0696");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 0);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0697");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(97L, timeUnit1, (int) (short) -1);
    }

    @Test
    public void TimedSemaphore0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0698");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, 100);
        int int5 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void TimedSemaphore0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0699");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) '#');
        long long7 = timedSemaphore3.getPeriod();
        boolean boolean8 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0700");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(10);
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void TimedSemaphore0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0701");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(10L, timeUnit1, (int) '#');
    }

    @Test
    public void TimedSemaphore0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0702");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (short) -1);
        timedSemaphore4.shutdown();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0703");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0704");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(35L, timeUnit1, 1);
    }

    @Test
    public void TimedSemaphore0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0705");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0706");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(1);
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void TimedSemaphore0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0707");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        long long8 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void TimedSemaphore0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0708");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, (int) (short) -1);
        timedSemaphore3.shutdown();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0709");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0710");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0711");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 100);
        int int4 = timedSemaphore3.getAvailablePermits();
        boolean boolean5 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0712");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) (short) 100);
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void TimedSemaphore0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0713");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
    }

    @Test
    public void TimedSemaphore0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0714");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0715");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0716");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0717");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void TimedSemaphore0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0718");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0719");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0720");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getLimit();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0721");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 1L, timeUnit2, (int) (byte) 10);
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void TimedSemaphore0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0722");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) ' ');
        boolean boolean4 = timedSemaphore3.isShutdown();
        int int5 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void TimedSemaphore0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0723");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0724");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) (byte) 100);
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0725");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 35);
    }

    @Test
    public void TimedSemaphore0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0726");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '4', timeUnit2, (int) ' ');
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass6 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0727");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) ' ');
        timedSemaphore3.setLimit((int) (short) 100);
        int int6 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void TimedSemaphore0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0728");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        long long7 = timedSemaphore4.getPeriod();
        int int8 = timedSemaphore4.getAcquireCount();
        boolean boolean9 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0729");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            java.lang.Class<?> wildcardClass6 = timeUnit5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0730");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) -1);
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void TimedSemaphore0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0731");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getLimit();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0732");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 35L, timeUnit2, 100);
    }

    @Test
    public void TimedSemaphore0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0733");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAvailablePermits();
        boolean boolean8 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0734");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        int int8 = timedSemaphore4.getLimit();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void TimedSemaphore0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0735");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0736");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLimit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0737");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getAvailablePermits();
        long long8 = timedSemaphore4.getPeriod();
        int int9 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void TimedSemaphore0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0738");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 0);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0739");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 0);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0740");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit((int) (byte) 100);
        timedSemaphore3.shutdown();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0741");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0742");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        long long8 = timedSemaphore3.getPeriod();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0743");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 100);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void TimedSemaphore0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0744");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.setLimit((int) 'a');
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0745");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0746");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getLimit();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0747");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 32);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void TimedSemaphore0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0748");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        long long7 = timedSemaphore4.getPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0749");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 1);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.setLimit(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void TimedSemaphore0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0750");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) -1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.setLimit((int) ' ');
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0751");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        long long8 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void TimedSemaphore0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0752");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0753");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        timedSemaphore4.shutdown();
        int int7 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void TimedSemaphore0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0754");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            java.lang.Class<?> wildcardClass6 = timeUnit5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0755");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) ' ');
        timedSemaphore3.setLimit((int) (byte) 100);
        timedSemaphore3.setLimit((int) (short) 0);
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0756");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0757");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getLimit();
        long long7 = timedSemaphore4.getPeriod();
        int int8 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void TimedSemaphore0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0758");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        int int8 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void TimedSemaphore0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0759");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 10);
    }

    @Test
    public void TimedSemaphore0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0760");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0761");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0762");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) 'a');
        boolean boolean5 = timedSemaphore4.isShutdown();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0763");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        long long7 = timedSemaphore3.getPeriod();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0764");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (short) -1);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0765");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0766");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) 100);
        timedSemaphore4.shutdown();
    }

    @Test
    public void TimedSemaphore0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0767");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void TimedSemaphore0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0768");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void TimedSemaphore0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0769");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0770");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0771");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0772");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        timedSemaphore4.shutdown();
        int int8 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0773");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        long long7 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void TimedSemaphore0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0774");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0775");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        timedSemaphore3.setLimit((int) (short) 10);
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0776");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        long long8 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0777");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        long long8 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void TimedSemaphore0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0778");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        timedSemaphore4.shutdown();
        int int8 = timedSemaphore4.getLastAcquiresPerPeriod();
        double double9 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0779");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        int int7 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0780");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0781");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0782");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 35, timeUnit1, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0783");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.setLimit(1);
        long long8 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void TimedSemaphore0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0784");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, 35);
    }

    @Test
    public void TimedSemaphore0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0785");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0786");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.shutdown();
        java.lang.Class<?> wildcardClass7 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0787");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getLimit();
        int int8 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0788");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (-1));
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void TimedSemaphore0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0789");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        long long7 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void TimedSemaphore0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0790");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 0, timeUnit1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0791");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0792");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (short) -1);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getAvailablePermits();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        boolean boolean8 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0793");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0794");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(1);
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0795");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0796");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (-1));
        long long5 = timedSemaphore4.getPeriod();
        long long6 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void TimedSemaphore0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0797");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(35L, timeUnit1, (int) '4');
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0798");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '#');
        int int5 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void TimedSemaphore0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0799");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 32, timeUnit2, (-1));
    }

    @Test
    public void TimedSemaphore0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0800");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(32L, timeUnit1, 32);
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        long long5 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void TimedSemaphore0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0801");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) (short) 100);
    }

    @Test
    public void TimedSemaphore0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0802");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '#');
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        boolean boolean7 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0803");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0804");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) -1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        long long6 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void TimedSemaphore0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0805");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0806");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0807");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void TimedSemaphore0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0808");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0809");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) '#');
        long long4 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void TimedSemaphore0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0810");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '4', timeUnit2, (int) (byte) 1);
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0811");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0812");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) 'a');
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0813");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0814");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getLimit();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0815");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(10L, timeUnit1, (int) (short) 0);
        int int4 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0816");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, 32);
    }

    @Test
    public void TimedSemaphore0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0817");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) (short) 0);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0818");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void TimedSemaphore0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0819");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
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
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0820");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 0, timeUnit1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0821");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.setLimit((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void TimedSemaphore0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0822");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0823");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0824");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0825");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, 10);
    }

    @Test
    public void TimedSemaphore0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0826");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, (int) (short) -1);
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) 'a');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0827");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0828");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '#');
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass7 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0829");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 35, timeUnit1, (int) (byte) 0);
    }

    @Test
    public void TimedSemaphore0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0830");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 0, timeUnit1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0831");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLimit();
        long long7 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void TimedSemaphore0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0832");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        long long7 = timedSemaphore4.getPeriod();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void TimedSemaphore0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0833");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.setLimit((int) '4');
        int int8 = timedSemaphore4.getAvailablePermits();
        int int9 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0834");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, (int) (short) 1);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0835");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void TimedSemaphore0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0836");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) ' ');
    }

    @Test
    public void TimedSemaphore0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0837");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getLimit();
        boolean boolean8 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0838");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit(10);
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0839");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) 'a');
        boolean boolean5 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0840");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0841");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void TimedSemaphore0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0842");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, 10);
    }

    @Test
    public void TimedSemaphore0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0843");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 97L, timeUnit2, 1);
    }

    @Test
    public void TimedSemaphore0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0844");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0845");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0846");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 32);
        timedSemaphore3.setLimit((int) (byte) 10);
    }

    @Test
    public void TimedSemaphore0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0847");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit((int) (short) 0);
        int int7 = timedSemaphore3.getAcquireCount();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0848");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        int int8 = timedSemaphore4.getAvailablePermits();
        int int9 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0849");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getLimit();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0850");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0851");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 32, timeUnit2, (int) (short) 100);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0852");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        int int8 = timedSemaphore4.getAvailablePermits();
        int int9 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void TimedSemaphore0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0853");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) '#');
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0854");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, (int) '4');
        long long5 = timedSemaphore4.getPeriod();
        boolean boolean6 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0855");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        long long7 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void TimedSemaphore0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0856");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0857");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLimit();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0858");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0859");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAcquireCount();
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0860");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        int int7 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0861");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.setLimit((int) '4');
        timedSemaphore4.shutdown();
        java.lang.Class<?> wildcardClass9 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0862");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLimit();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0863");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0864");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        timedSemaphore3.setLimit((int) (byte) -1);
    }

    @Test
    public void TimedSemaphore0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0865");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) 'a');
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0866");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0867");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getLimit();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void TimedSemaphore0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0868");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) (byte) 100);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0869");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) ' ');
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        boolean boolean5 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0870");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        timedSemaphore3.setLimit((int) 'a');
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0871");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) -1);
        long long4 = timedSemaphore3.getPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void TimedSemaphore0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0872");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 0);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0873");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.setLimit((int) (byte) 1);
        timedSemaphore3.setLimit((int) '4');
    }

    @Test
    public void TimedSemaphore0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0874");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0875");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(1);
        int int7 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0876");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLimit();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0877");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAvailablePermits();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0878");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (byte) 10);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void TimedSemaphore0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0879");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, (int) '#');
        timedSemaphore3.setLimit((int) (short) 10);
        timedSemaphore3.setLimit((int) '4');
    }

    @Test
    public void TimedSemaphore0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0880");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0881");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, 1);
    }

    @Test
    public void TimedSemaphore0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0882");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 35, timeUnit1, (int) '4');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0883");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        int int6 = timedSemaphore3.getLimit();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getLimit();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0884");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0885");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        java.lang.Class<?> wildcardClass8 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0886");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0887");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) (byte) 100);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0888");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 35L, timeUnit2, 0);
    }

    @Test
    public void TimedSemaphore0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0889");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.setLimit((int) (byte) 1);
        timedSemaphore3.setLimit(0);
    }

    @Test
    public void TimedSemaphore0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0890");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.setLimit((int) (short) 1);
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0891");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0892");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) -1);
        int int5 = timedSemaphore4.getAvailablePermits();
        java.lang.Class<?> wildcardClass6 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0893");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0894");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getAvailablePermits();
        int int8 = timedSemaphore4.getLimit();
        double double9 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0895");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0896");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (byte) 1);
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0897");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0898");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0899");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 0, timeUnit2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0900");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (int) '#');
        int int4 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0901");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 1);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        long long6 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void TimedSemaphore0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0902");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, (int) '4');
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0903");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getLimit();
        long long8 = timedSemaphore3.getPeriod();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0904");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0905");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean6 = timedSemaphore4.isShutdown();
        timedSemaphore4.setLimit((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0906");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 10);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void TimedSemaphore0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0907");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0908");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0909");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void TimedSemaphore0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0910");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        int int5 = timedSemaphore4.getLimit();
        long long6 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void TimedSemaphore0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0911");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        long long8 = timedSemaphore3.getPeriod();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0912");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLimit();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void TimedSemaphore0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0913");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0914");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 32);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0915");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 100);
        timedSemaphore3.setLimit((int) '#');
    }

    @Test
    public void TimedSemaphore0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0916");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0917");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        long long9 = timedSemaphore3.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0918");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, (int) '#');
        boolean boolean4 = timedSemaphore3.isShutdown();
        long long5 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void TimedSemaphore0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0919");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '#');
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0920");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0921");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        long long8 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0922");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) 'a');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0923");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (-1));
        timedSemaphore4.shutdown();
    }

    @Test
    public void TimedSemaphore0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0924");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        timedSemaphore4.setLimit((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0925");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(97L, timeUnit1, (int) (short) 0);
    }

    @Test
    public void TimedSemaphore0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0926");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0927");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0928");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0929");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        long long7 = timedSemaphore3.getPeriod();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0930");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.setLimit((int) '4');
        int int8 = timedSemaphore4.getAvailablePermits();
        double double9 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0931");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 10);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0932");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 10);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0933");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 32);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0934");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0935");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAcquireCount();
        long long8 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0936");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 35, timeUnit2, 10);
    }

    @Test
    public void TimedSemaphore0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0937");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (-1));
    }

    @Test
    public void TimedSemaphore0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0938");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getAvailablePermits();
        int int7 = timedSemaphore4.getAcquireCount();
        int int8 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void TimedSemaphore0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0939");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0940");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) 'a');
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void TimedSemaphore0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0941");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 1);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void TimedSemaphore0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0942");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        timedSemaphore4.shutdown();
        timedSemaphore4.shutdown();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        timedSemaphore4.setLimit((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0943");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        int int6 = timedSemaphore4.getAvailablePermits();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0944");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        long long8 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void TimedSemaphore0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0945");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0946");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0947");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 0);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0948");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAcquireCount();
        long long8 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0949");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0950");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean8 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void TimedSemaphore0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0951");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0952");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 0);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        int int7 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0953");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0954");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) 100);
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void TimedSemaphore0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0955");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void TimedSemaphore0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0956");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAcquireCount();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        boolean boolean6 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0957");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 1);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0958");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, (int) (short) 0);
        boolean boolean5 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0959");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAcquireCount();
        int int8 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0960");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        java.lang.Class<?> wildcardClass7 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0961");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void TimedSemaphore0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0962");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) (short) 100);
    }

    @Test
    public void TimedSemaphore0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0963");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        timedSemaphore4.shutdown();
        boolean boolean6 = timedSemaphore4.isShutdown();
        java.lang.Class<?> wildcardClass7 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0964");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void TimedSemaphore0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0965");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0966");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0967");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0968");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0969");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(35L, timeUnit1, 32);
        int int4 = timedSemaphore3.getAvailablePermits();
        int int5 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void TimedSemaphore0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0970");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) (short) 0);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0971");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 32);
        boolean boolean4 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void TimedSemaphore0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0972");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (byte) -1);
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void TimedSemaphore0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0973");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0974");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        int int8 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0975");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 10, timeUnit1, (int) (byte) 100);
    }

    @Test
    public void TimedSemaphore0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0976");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0977");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAvailablePermits();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0978");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (int) (short) 10);
        boolean boolean5 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0979");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (short) -1);
        int int5 = timedSemaphore4.getAvailablePermits();
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
    public void TimedSemaphore0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0980");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0981");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) '#');
    }

    @Test
    public void TimedSemaphore0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0982");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0983");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0984");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) -1);
        boolean boolean5 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0985");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        timedSemaphore3.setLimit((int) (short) 10);
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0986");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (byte) 100);
        int int5 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void TimedSemaphore0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0987");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 0);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void TimedSemaphore0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0988");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0989");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getLimit();
        java.lang.Class<?> wildcardClass7 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0990");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.shutdown();
        int int5 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0991");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) '#');
        boolean boolean5 = timedSemaphore4.isShutdown();
        boolean boolean6 = timedSemaphore4.isShutdown();
        timedSemaphore4.setLimit(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0992");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (byte) 10);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0993");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0994");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) (byte) 100);
    }

    @Test
    public void TimedSemaphore0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0995");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0996");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0997");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, 35);
    }

    @Test
    public void TimedSemaphore0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0998");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getAcquireCount();
        java.lang.Class<?> wildcardClass6 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore0999");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (int) '#');
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLimit();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.TimedSemaphore1000");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }
}

