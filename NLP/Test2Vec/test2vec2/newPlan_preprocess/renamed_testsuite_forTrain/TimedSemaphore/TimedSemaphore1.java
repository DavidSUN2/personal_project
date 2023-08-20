
package TimedSemaphore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimedSemaphore1 {

    public static boolean debug = false;

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0501");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 10);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0502");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0503");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0504");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0505");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0506");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 100);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0507");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0508");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0509");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0510");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0511");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0512");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) (short) 10);
        int int5 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0513");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0514");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (-1L), timeUnit2, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0515");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0516");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 0, timeUnit2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0517");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0518");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0519");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0520");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0521");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0522");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0523");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0524");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        timedSemaphore4.setLimit(10);
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0525");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0526");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0527");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0528");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, 52);
        timedSemaphore4.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0529");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0530");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0531");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0532");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 1, timeUnit2, 0);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0533");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0534");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, 32);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0535");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0536");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0537");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0538");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0539");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0540");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0541");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0542");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0543");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) ' ');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0544");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0545");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0546");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0547");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0548");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0549");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0550");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) -1, timeUnit2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0551");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0552");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0553");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0554");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0555");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0556");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0557");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0558");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (-1L), timeUnit2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0559");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0560");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0561");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0562");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 0);
        boolean boolean4 = timedSemaphore3.isShutdown();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        long long6 = timedSemaphore3.getPeriod();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0563");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0564");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0565");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0566");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0567");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 52);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0568");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0569");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0570");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0571");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0572");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0573");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0574");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0575");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0576");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0577");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0578");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 0, timeUnit2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0579");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0580");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0581");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0582");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0583");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0584");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, (int) '4');
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0585");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0586");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0587");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0588");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) '#');
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0589");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0590");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0591");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0592");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0593");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 100);
        timedSemaphore3.setLimit((int) (short) -1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0594");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 0, timeUnit2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0595");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0596");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0597");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0598");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0599");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0600");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((-1L), timeUnit1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0601");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0602");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0603");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0604");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0605");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0606");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '4');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0607");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 32);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0608");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0609");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0610");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0611");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0612");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0613");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0614");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0615");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0616");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0617");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0618");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0619");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0620");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0621");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0622");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 0);
        int int4 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0623");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) '#');
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.setLimit((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0624");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0625");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0626");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 100);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0627");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0628");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0629");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (-1L), timeUnit2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0630");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, (-1));
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0631");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0632");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 100);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0633");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) '4');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0634");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) (short) 100);
        timedSemaphore4.setLimit(1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0635");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 52, timeUnit1, 52);
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0636");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0637");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0638");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0639");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (-1));
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0640");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0641");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) 'a');
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0642");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0643");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (byte) -1);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0644");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0645");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0646");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0647");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((-1L), timeUnit1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0648");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0649");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLimit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0650");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0651");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0652");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0653");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0654");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0655");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        timedSemaphore4.shutdown();
        boolean boolean6 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0656");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0657");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 32, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (short) 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0658");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0659");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0660");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (int) '#');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0661");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0662");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) -1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0663");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0664");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) -1, timeUnit2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0665");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0666");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.shutdown();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0667");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0668");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0669");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) ' ');
        timedSemaphore3.setLimit((int) (byte) 100);
        timedSemaphore3.setLimit((int) (short) 0);
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0670");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) '#');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0671");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 1, timeUnit2, (int) (short) 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0672");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 1L, timeUnit2, (int) (byte) 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0673");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0674");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 10);
        timedSemaphore4.setLimit((int) 'a');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0675");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0676");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0677");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0678");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0679");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0680");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0681");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0682");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) '#');
        boolean boolean5 = timedSemaphore4.isShutdown();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0683");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0684");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0685");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (short) 10);
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0686");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0687");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 1);
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0688");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0689");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) -1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0690");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0691");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0692");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0693");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(97L, timeUnit1, (int) (short) 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0694");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0695");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0696");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0697");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(97L, timeUnit1, (int) (short) -1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0698");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, 100);
        int int5 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0699");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0700");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0701");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(10L, timeUnit1, (int) '#');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0702");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (short) -1);
        timedSemaphore4.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0703");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0704");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(35L, timeUnit1, 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0705");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0706");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0707");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0708");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, (int) (short) -1);
        timedSemaphore3.shutdown();
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0709");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0710");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0711");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0712");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) (short) 100);
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0713");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0714");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0715");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0716");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0717");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0718");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0719");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0720");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0721");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 1L, timeUnit2, (int) (byte) 10);
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0722");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0723");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0724");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0725");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 35);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0726");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0727");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) ' ');
        timedSemaphore3.setLimit((int) (short) 100);
        int int6 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0728");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0729");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0730");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) -1);
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0731");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0732");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 35L, timeUnit2, 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0733");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0734");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0735");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0736");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0737");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0738");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 0);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0739");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0740");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0741");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0742");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0743");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0744");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0745");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0746");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0747");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 32);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0748");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0749");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 1);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.setLimit(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0750");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0751");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0752");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0753");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0754");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0755");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0756");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0757");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0758");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0759");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0760");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0761");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0762");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) 'a');
        boolean boolean5 = timedSemaphore4.isShutdown();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0763");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0764");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0765");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0766");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) 100);
        timedSemaphore4.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0767");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0768");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0769");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0770");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0771");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0772");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0773");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0774");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0775");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0776");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0777");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0778");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0779");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0780");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0781");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0782");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 35, timeUnit1, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0783");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0784");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, 35);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0785");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0786");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0787");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0788");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (-1));
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0789");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0790");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 0, timeUnit1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0791");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0792");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0793");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0794");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0795");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0796");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0797");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(35L, timeUnit1, (int) '4');
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0798");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '#');
        int int5 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0799");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 32, timeUnit2, (-1));
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0800");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0801");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) (short) 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0802");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0803");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0804");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0805");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0806");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0807");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0808");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0809");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) '#');
        long long4 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0810");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '4', timeUnit2, (int) (byte) 1);
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0811");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0812");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) 'a');
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0813");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0814");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0815");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0816");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, 32);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0817");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) (short) 0);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0818");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0819");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0820");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 0, timeUnit1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0821");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.setLimit((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0822");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0823");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0824");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0825");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0826");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, (int) (short) -1);
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) 'a');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0827");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0828");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0829");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 35, timeUnit1, (int) (byte) 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0830");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 0, timeUnit1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0831");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0832");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0833");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0834");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0835");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0836");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) ' ');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0837");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0838");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0839");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) 'a');
        boolean boolean5 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0840");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0841");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0842");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0843");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 97L, timeUnit2, 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0844");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0845");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0846");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 32);
        timedSemaphore3.setLimit((int) (byte) 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0847");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0848");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0849");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0850");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0851");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0852");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0853");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) '#');
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0854");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0855");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0856");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0857");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0858");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0859");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0860");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0861");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0862");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0863");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0864");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        timedSemaphore3.setLimit((int) (byte) -1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0865");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) 'a');
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0866");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0867");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0868");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) (byte) 100);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0869");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0870");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0871");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) -1);
        long long4 = timedSemaphore3.getPeriod();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0872");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 0);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0873");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.setLimit((int) (byte) 1);
        timedSemaphore3.setLimit((int) '4');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0874");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0875");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0876");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0877");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0878");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0879");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, (int) '#');
        timedSemaphore3.setLimit((int) (short) 10);
        timedSemaphore3.setLimit((int) '4');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0880");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0881");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0882");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 35, timeUnit1, (int) '4');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0883");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0884");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0885");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0886");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0887");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) (byte) 100);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0888");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 35L, timeUnit2, 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0889");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.setLimit((int) (byte) 1);
        timedSemaphore3.setLimit(0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0890");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.setLimit((int) (short) 1);
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0891");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0892");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0893");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0894");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0895");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0896");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0897");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0898");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0899");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 0, timeUnit2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0900");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0901");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0902");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0903");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0904");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0905");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0906");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 10);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0907");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0908");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0909");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0910");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0911");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0912");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0913");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0914");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 32);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0915");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 100);
        timedSemaphore3.setLimit((int) '#');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0916");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0917");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0918");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0919");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0920");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0921");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0922");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) 'a');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0923");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (-1));
        timedSemaphore4.shutdown();
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0924");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0925");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(97L, timeUnit1, (int) (short) 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0926");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0927");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0928");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0929");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0930");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0931");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0932");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 10);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0933");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 32);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0934");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0935");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0936");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 35, timeUnit2, 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0937");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (-1));
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0938");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0939");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0940");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) 'a');
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0941");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0942");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0943");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0944");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0945");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0946");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0947");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0948");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0949");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0950");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0951");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0952");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0953");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0954");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) 100);
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0955");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0956");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0957");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0958");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, (int) (short) 0);
        boolean boolean5 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0959");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0960");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0961");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0962");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) (short) 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0963");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0964");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0965");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0966");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0967");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0968");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0969");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0970");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0971");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 32);
        boolean boolean4 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0972");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0973");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0974");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0975");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 10, timeUnit1, (int) (byte) 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0976");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) (short) 1);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0977");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0978");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (int) (short) 10);
        boolean boolean5 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0979");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (short) -1);
        int int5 = timedSemaphore4.getAvailablePermits();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0980");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0981");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) '#');
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0982");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        // The following exception was thrown during execution in test generation
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0983");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0984");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) -1);
        boolean boolean5 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0985");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0986");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (byte) 100);
        int int5 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0987");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 0);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0988");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0989");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0990");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        timedSemaphore3.shutdown();
        int int5 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0991");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0992");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (byte) 10);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0993");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0994");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) (byte) 100);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0995");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0996");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0997");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, 35);
    }

    @Test
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0998");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test0999");
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
    public void TimedSemaphore() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore1.test1000");
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

