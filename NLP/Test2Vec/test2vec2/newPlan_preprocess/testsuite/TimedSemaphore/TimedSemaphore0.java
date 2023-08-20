package TimedSemaphore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimedSemaphore0 {

    public static boolean debug = false;

    @Test
    public void TimedSemaphore0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0001");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) -1, timeUnit1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0002");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0003");
        int int0 = org.apache.commons.lang3.concurrent.TimedSemaphore.NO_LIMIT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void TimedSemaphore0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0004");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((-1L), timeUnit1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0005");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0006");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 0, timeUnit1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0007");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0008");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void TimedSemaphore0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0009");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0010");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0011");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0012");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 0, timeUnit2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0013");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0014");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void TimedSemaphore0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0015");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0016");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0017");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        long long8 = timedSemaphore3.getPeriod();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0018");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0019");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) -1, timeUnit2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0020");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0021");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getLimit();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0022");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0023");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0024");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0025");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAcquireCount();
        long long9 = timedSemaphore3.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0026");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.setLimit((int) (byte) 100);
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
    public void TimedSemaphore0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0027");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0028");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0029");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0030");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit((int) (byte) 1);
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
    public void TimedSemaphore0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0031");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.setLimit(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void TimedSemaphore0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0032");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0033");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0034");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0035");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
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
    public void TimedSemaphore0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0036");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0037");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0038");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0039");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 0);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0040");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
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
    public void TimedSemaphore0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0041");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0042");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        boolean boolean7 = timedSemaphore4.isShutdown();
        java.lang.Class<?> wildcardClass8 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0043");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0044");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0045");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(1);
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
    public void TimedSemaphore0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0046");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getLimit();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0047");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore4.getAvailablePermits();
        int int9 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void TimedSemaphore0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0048");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0049");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) -1, timeUnit1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0050");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getLimit();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0051");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 0, timeUnit2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0052");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0053");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0054");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0055");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getLimit();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0056");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getAvailablePermits();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0057");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLimit();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void TimedSemaphore0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0058");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0059");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0060");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        timedSemaphore3.shutdown();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0061");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            java.lang.Class<?> wildcardClass7 = timeUnit6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0062");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        boolean boolean7 = timedSemaphore4.isShutdown();
        long long8 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void TimedSemaphore0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0063");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass5 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0064");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getLimit();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0065");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 0, timeUnit2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0066");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0067");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0068");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
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
    }

    @Test
    public void TimedSemaphore0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0069");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0070");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
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
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0071");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0072");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0073");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        long long8 = timedSemaphore3.getPeriod();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0074");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        java.lang.Class<?> wildcardClass6 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0075");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0076");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean9 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0077");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0078");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 0, timeUnit1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0079");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0080");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0081");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.setLimit((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0082");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0083");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0084");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.setLimit((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0085");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        long long8 = timedSemaphore3.getPeriod();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0086");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0087");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (-1));
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0088");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0089");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0090");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) -1, timeUnit2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0091");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0092");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((-1L), timeUnit1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0093");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean8 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0094");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 1L, timeUnit2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0095");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0096");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0097");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0098");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0099");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0100");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0101");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 0, timeUnit2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0102");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
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
    public void TimedSemaphore0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0103");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
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
    public void TimedSemaphore0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0104");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) (byte) 100);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0105");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0106");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0107");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        timedSemaphore3.setLimit((int) (short) 10);
    }

    @Test
    public void TimedSemaphore0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0108");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        long long8 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0109");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0110");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0111");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) (short) 10);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0112");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0113");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getAcquireCount();
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
    public void TimedSemaphore0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0114");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0115");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0116");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0117");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) -1, timeUnit1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0118");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0119");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) -1, timeUnit2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0120");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 0, timeUnit2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0121");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0122");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0123");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0124");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0125");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (byte) -1);
    }

    @Test
    public void TimedSemaphore0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0126");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0127");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0128");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        boolean boolean8 = timedSemaphore3.isShutdown();
        long long9 = timedSemaphore3.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0129");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void TimedSemaphore0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0130");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0131");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0132");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0133");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
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
    public void TimedSemaphore0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0134");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0135");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.setLimit((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0136");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0137");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0138");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) -1, timeUnit1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0139");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0140");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void TimedSemaphore0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0141");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0142");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0143");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0144");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0145");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0146");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, (int) '4');
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0147");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void TimedSemaphore0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0148");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0149");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0150");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        long long8 = timedSemaphore3.getPeriod();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0151");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0152");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0153");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0154");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, 32);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0155");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0156");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0157");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getLimit();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0158");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) ' ');
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
    public void TimedSemaphore0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0159");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0160");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0161");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0162");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 0, timeUnit1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0163");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0164");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore4.getAvailablePermits();
        boolean boolean9 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0165");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0166");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0167");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void TimedSemaphore0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0168");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        boolean boolean8 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0169");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (int) (byte) 100);
    }

    @Test
    public void TimedSemaphore0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0170");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getAcquireCount();
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
    public void TimedSemaphore0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0171");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, (int) '4');
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void TimedSemaphore0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0172");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore4.getAvailablePermits();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void TimedSemaphore0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0173");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        timedSemaphore4.setLimit(100);
    }

    @Test
    public void TimedSemaphore0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0174");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getAcquireCount();
        timedSemaphore4.setLimit(52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0175");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) 100);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0176");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0177");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        long long9 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void TimedSemaphore0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0178");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        timedSemaphore3.setLimit(100);
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0179");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
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
    }

    @Test
    public void TimedSemaphore0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0180");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0181");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAcquireCount();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0182");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0183");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void TimedSemaphore0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0184");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0185");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getAvailablePermits();
        int int8 = timedSemaphore4.getLimit();
        int int9 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void TimedSemaphore0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0186");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0187");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0188");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0189");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        long long7 = timedSemaphore3.getPeriod();
        int int8 = timedSemaphore3.getLimit();
        int int9 = timedSemaphore3.getAvailablePermits();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0190");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLimit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0191");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0192");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getAvailablePermits();
        int int8 = timedSemaphore4.getLimit();
        int int9 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0193");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0194");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (-1));
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0195");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0196");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) -1, timeUnit2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0197");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0198");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) (byte) 100);
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0199");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0200");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass8 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0201");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0202");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        boolean boolean5 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0203");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void TimedSemaphore0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0204");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getAcquireCount();
        int int8 = timedSemaphore3.getAvailablePermits();
        long long9 = timedSemaphore3.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0205");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0206");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0207");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0208");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (-1));
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0209");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0210");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) -1, timeUnit1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0211");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 0);
        timedSemaphore3.shutdown();
        int int5 = timedSemaphore3.getAvailablePermits();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0212");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0213");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0214");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getAcquireCount();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0215");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void TimedSemaphore0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0216");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) '#');
        boolean boolean5 = timedSemaphore4.isShutdown();
        java.lang.Class<?> wildcardClass6 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0217");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        int int8 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void TimedSemaphore0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0218");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0219");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit((int) (short) 0);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0220");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, (int) (short) 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean6 = timedSemaphore4.isShutdown();
        java.lang.Class<?> wildcardClass7 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0221");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0222");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0223");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore4.getAvailablePermits();
        int int9 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0224");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getLimit();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0225");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        timedSemaphore4.shutdown();
        timedSemaphore4.shutdown();
        int int7 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0226");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0227");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getAvailablePermits();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void TimedSemaphore0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0228");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0229");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getLimit();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0230");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (-1));
    }

    @Test
    public void TimedSemaphore0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0231");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) (byte) -1);
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0232");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.setLimit((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0233");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0234");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0235");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (short) 10);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0236");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0237");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 0);
    }

    @Test
    public void TimedSemaphore0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0238");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0239");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        timedSemaphore4.shutdown();
        int int7 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0240");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0241");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(10L, timeUnit1, (-1));
        boolean boolean4 = timedSemaphore3.isShutdown();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void TimedSemaphore0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0242");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.setLimit((int) '4');
        int int8 = timedSemaphore4.getAvailablePermits();
        java.lang.Class<?> wildcardClass9 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0243");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0244");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        timedSemaphore4.shutdown();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0245");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0246");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0247");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        boolean boolean5 = timedSemaphore4.isShutdown();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore4.isShutdown();
        long long8 = timedSemaphore4.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void TimedSemaphore0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0248");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0249");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        boolean boolean7 = timedSemaphore4.isShutdown();
        timedSemaphore4.setLimit((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void TimedSemaphore0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0250");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) (byte) 100);
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void TimedSemaphore0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0251");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLimit();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0252");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
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
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0253");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0254");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        timedSemaphore4.setLimit((int) (byte) -1);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0255");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        int int9 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0256");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0257");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (-1L), timeUnit2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0258");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLimit();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0259");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        long long8 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void TimedSemaphore0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0260");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void TimedSemaphore0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0261");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 100, timeUnit2, 52);
    }

    @Test
    public void TimedSemaphore0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0262");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        int int9 = timedSemaphore3.getAvailablePermits();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0263");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0264");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.setLimit((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0265");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) '#');
        int int7 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0266");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAcquireCount();
        long long8 = timedSemaphore3.getPeriod();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0267");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAvailablePermits();
        long long8 = timedSemaphore3.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0268");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((-1L), timeUnit1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0269");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(1);
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void TimedSemaphore0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0270");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 0);
        timedSemaphore3.shutdown();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0271");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, 32);
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0272");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        timedSemaphore3.setLimit(100);
        int int9 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void TimedSemaphore0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0273");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        long long7 = timedSemaphore4.getPeriod();
        int int8 = timedSemaphore4.getAcquireCount();
        int int9 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0274");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
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
    public void TimedSemaphore0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0275");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (int) '#');
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0276");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0277");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.setLimit((int) '4');
        java.lang.Class<?> wildcardClass8 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0278");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        int int8 = timedSemaphore4.getAvailablePermits();
        java.lang.Class<?> wildcardClass9 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0279");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (short) -1);
        timedSemaphore3.setLimit((int) (short) 1);
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0280");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '#', timeUnit1, (int) 'a');
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0281");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0282");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        int int8 = timedSemaphore4.getAvailablePermits();
        java.lang.Class<?> wildcardClass9 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0283");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        timedSemaphore4.setLimit(10);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0284");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) ' ');
    }

    @Test
    public void TimedSemaphore0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0285");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getLimit();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void TimedSemaphore0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0286");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0287");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) -1, timeUnit2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0288");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) (byte) 100);
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0289");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAvailablePermits();
        boolean boolean7 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0290");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0291");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0292");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) -1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass6 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0293");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0294");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 0, timeUnit2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0295");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0296");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 0, timeUnit1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0297");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 10);
    }

    @Test
    public void TimedSemaphore0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0298");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0299");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
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
    }

    @Test
    public void TimedSemaphore0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0300");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0301");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0302");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 1);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0303");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0304");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '#', timeUnit1, 32);
    }

    @Test
    public void TimedSemaphore0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0305");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 1);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0306");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 0);
        timedSemaphore3.shutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0307");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0308");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0309");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getLimit();
        int int9 = timedSemaphore3.getAcquireCount();
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
    public void TimedSemaphore0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0310");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0311");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0312");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLimit();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0313");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        long long7 = timedSemaphore4.getPeriod();
        int int8 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0314");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0315");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) ' ', timeUnit1, (int) '4');
        timedSemaphore3.setLimit((int) (byte) 0);
    }

    @Test
    public void TimedSemaphore0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0316");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.setLimit((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0317");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        timedSemaphore4.shutdown();
        java.lang.Class<?> wildcardClass8 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0318");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 0, timeUnit1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0319");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) -1, timeUnit1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0320");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getAvailablePermits();
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
    public void TimedSemaphore0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0321");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0322");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            java.lang.Class<?> wildcardClass9 = timeUnit8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0323");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) -1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0324");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0325");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 100, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getLimit();
        int int5 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0326");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 1);
        long long5 = timedSemaphore4.getPeriod();
        boolean boolean6 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void TimedSemaphore0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0327");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0328");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        timedSemaphore4.shutdown();
        int int9 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0329");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit((int) (short) 1);
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0330");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        int int9 = timedSemaphore3.getLimit();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0331");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0332");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        timedSemaphore3.setLimit((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void TimedSemaphore0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0333");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, 0);
        int int4 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0334");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0335");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 1);
        timedSemaphore4.shutdown();
    }

    @Test
    public void TimedSemaphore0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0336");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0337");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0338");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '#');
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            java.lang.Class<?> wildcardClass7 = timeUnit6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0339");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0340");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 'a', timeUnit1, (int) (byte) -1);
        int int4 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void TimedSemaphore0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0341");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 100L, timeUnit2, 0);
    }

    @Test
    public void TimedSemaphore0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0342");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0343");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        long long8 = timedSemaphore3.getPeriod();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0344");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, 52);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0345");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        boolean boolean6 = timedSemaphore3.isShutdown();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0346");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0347");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0348");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0349");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 32, timeUnit2, 10);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0350");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        java.lang.Class<?> wildcardClass9 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0351");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: TimedSemaphore is shut down!");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void TimedSemaphore0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0352");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 10L, timeUnit2, (int) (byte) 1);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void TimedSemaphore0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0353");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        timedSemaphore3.setLimit((int) (short) 10);
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0354");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit(0);
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0355");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) -1, timeUnit2, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0356");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAvailablePermits();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0357");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0358");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        int int8 = timedSemaphore4.getAvailablePermits();
        int int9 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void TimedSemaphore0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0359");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (-1), timeUnit1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0360");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, (int) '#');
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0361");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getLimit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0362");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getAvailablePermits();
        boolean boolean8 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
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
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0363");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0364");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) ' ', timeUnit1, (int) '4');
        timedSemaphore3.setLimit((int) (byte) 100);
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0365");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, 10);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0366");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        long long8 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void TimedSemaphore0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0367");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) ' ');
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0368");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit((int) (byte) 100);
        int int8 = timedSemaphore3.getAcquireCount();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0369");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0370");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        long long9 = timedSemaphore3.getPeriod();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0371");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        boolean boolean6 = timedSemaphore3.isShutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        long long8 = timedSemaphore3.getPeriod();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0372");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0373");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0374");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        timedSemaphore4.setLimit(10);
        boolean boolean7 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0375");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit((int) (short) 1);
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0376");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getLimit();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0377");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getLimit();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        boolean boolean9 = timedSemaphore3.isShutdown();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0378");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        timedSemaphore3.setLimit((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void TimedSemaphore0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0379");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) (short) 0);
    }

    @Test
    public void TimedSemaphore0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0380");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        long long7 = timedSemaphore4.getPeriod();
        boolean boolean8 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void TimedSemaphore0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0381");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 1);
        int int5 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void TimedSemaphore0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0382");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0383");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 0, timeUnit1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0384");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        long long7 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void TimedSemaphore0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0385");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        timedSemaphore4.shutdown();
        timedSemaphore4.shutdown();
        int int7 = timedSemaphore4.getAcquireCount();
        int int8 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0386");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0387");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void TimedSemaphore0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0388");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((-1L), timeUnit1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0389");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0390");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void TimedSemaphore0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0391");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0392");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '#', timeUnit1, (int) (byte) 100);
    }

    @Test
    public void TimedSemaphore0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0393");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 32, timeUnit1, (int) (short) 1);
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
    }

    @Test
    public void TimedSemaphore0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0394");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 0, timeUnit1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0395");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLimit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getLimit();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0396");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAvailablePermits();
        boolean boolean7 = timedSemaphore3.isShutdown();
        boolean boolean8 = timedSemaphore3.isShutdown();
        boolean boolean9 = timedSemaphore3.isShutdown();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0397");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0398");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0399");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0400");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 100, timeUnit1, (int) (short) 10);
        int int4 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0401");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
        int int7 = timedSemaphore4.getLimit();
        java.lang.Class<?> wildcardClass8 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0402");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
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
    public void TimedSemaphore0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0403");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        timedSemaphore3.setLimit(100);
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0404");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 52, timeUnit1, (int) (byte) 100);
        boolean boolean4 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void TimedSemaphore0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0405");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 52, timeUnit2, (int) (short) -1);
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
    public void TimedSemaphore0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0406");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0407");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (int) (short) 10);
        timedSemaphore4.shutdown();
        double double6 = timedSemaphore4.getAverageCallsPerPeriod();
        int int7 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0408");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) ' ');
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void TimedSemaphore0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0409");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(100L, timeUnit1, 0);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0410");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0411");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0412");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        int int8 = timedSemaphore3.getAvailablePermits();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0413");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.shutdown();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0414");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        int int8 = timedSemaphore4.getAvailablePermits();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void TimedSemaphore0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0415");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void TimedSemaphore0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0416");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        long long6 = timedSemaphore3.getPeriod();
        timedSemaphore3.setLimit((int) (short) 10);
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0417");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void TimedSemaphore0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0418");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(35L, timeUnit1, 32);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0419");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, (int) 'a');
    }

    @Test
    public void TimedSemaphore0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0420");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 32, timeUnit2, 10);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0421");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void TimedSemaphore0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0422");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        java.lang.Class<?> wildcardClass5 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0423");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) (short) 10);
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
    public void TimedSemaphore0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0424");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0425");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getLimit();
        long long7 = timedSemaphore4.getPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        int int9 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0426");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        timedSemaphore4.setLimit((int) '#');
        java.lang.Class<?> wildcardClass7 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void TimedSemaphore0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0427");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        long long6 = timedSemaphore4.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void TimedSemaphore0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0428");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        int int5 = timedSemaphore4.getAcquireCount();
        long long6 = timedSemaphore4.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void TimedSemaphore0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0429");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        timedSemaphore4.setLimit((int) (byte) -1);
        int int7 = timedSemaphore4.getAcquireCount();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0430");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0431");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getLimit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        timedSemaphore3.setLimit((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
    }

    @Test
    public void TimedSemaphore0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0432");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0433");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (-1L), timeUnit2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0434");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit(32);
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void TimedSemaphore0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0435");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, 32);
    }

    @Test
    public void TimedSemaphore0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0436");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 10, timeUnit1, 10);
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void TimedSemaphore0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0437");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 0);
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        java.lang.Class<?> wildcardClass6 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0438");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(1L, timeUnit1, 0);
        timedSemaphore3.setLimit((int) 'a');
    }

    @Test
    public void TimedSemaphore0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0439");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0440");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (-1));
        boolean boolean4 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void TimedSemaphore0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0441");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 52, timeUnit1, (int) (byte) 100);
        timedSemaphore3.shutdown();
    }

    @Test
    public void TimedSemaphore0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0442");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 1, timeUnit1, 32);
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void TimedSemaphore0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0443");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '4', timeUnit2, 1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void TimedSemaphore0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0444");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) -1, timeUnit2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0445");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 10, timeUnit2, (-1));
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        java.lang.Class<?> wildcardClass6 = timedSemaphore4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void TimedSemaphore0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0446");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0447");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 0);
        boolean boolean4 = timedSemaphore3.isShutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0448");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void TimedSemaphore0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0449");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, 1);
    }

    @Test
    public void TimedSemaphore0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0450");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (-1));
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void TimedSemaphore0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0451");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getLimit();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0452");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) ' ');
        timedSemaphore3.setLimit((int) (byte) 100);
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        long long7 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void TimedSemaphore0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0453");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getAvailablePermits();
        int int9 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0454");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getAcquireCount();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0455");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLimit();
        int int6 = timedSemaphore4.getLimit();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0456");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0457");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) '#');
        long long5 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void TimedSemaphore0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0458");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, 0);
        int int5 = timedSemaphore4.getAvailablePermits();
        int int6 = timedSemaphore4.getLimit();
        int int7 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore4.getUnit();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0459");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (byte) -1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore4.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0460");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) (byte) 100);
        boolean boolean4 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void TimedSemaphore0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0461");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '#', timeUnit1, (int) '4');
    }

    @Test
    public void TimedSemaphore0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0462");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, 52);
    }

    @Test
    public void TimedSemaphore0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0463");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0464");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        int int6 = timedSemaphore3.getLimit();
        boolean boolean7 = timedSemaphore3.isShutdown();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        boolean boolean9 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void TimedSemaphore0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0465");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getAvailablePermits();
        boolean boolean7 = timedSemaphore3.isShutdown();
        long long8 = timedSemaphore3.getPeriod();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0466");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 10, timeUnit1, (int) (short) 100);
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        int int5 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void TimedSemaphore0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0467");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) -1);
        long long4 = timedSemaphore3.getPeriod();
        java.lang.Class<?> wildcardClass5 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void TimedSemaphore0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0468");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAvailablePermits();
        java.util.concurrent.TimeUnit timeUnit9 = timedSemaphore3.getUnit();
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
        org.junit.Assert.assertNull(timeUnit9);
    }

    @Test
    public void TimedSemaphore0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0469");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        boolean boolean4 = timedSemaphore3.isShutdown();
        boolean boolean5 = timedSemaphore3.isShutdown();
        timedSemaphore3.setLimit((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void TimedSemaphore0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0470");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 100, timeUnit2, (int) (short) 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void TimedSemaphore0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0471");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        long long7 = timedSemaphore3.getPeriod();
        boolean boolean8 = timedSemaphore3.isShutdown();
        int int9 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void TimedSemaphore0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0472");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void TimedSemaphore0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0473");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void TimedSemaphore0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0474");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        int int7 = timedSemaphore3.getAvailablePermits();
        int int8 = timedSemaphore3.getLimit();
        java.lang.Class<?> wildcardClass9 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void TimedSemaphore0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0475");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0476");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (int) (byte) 0);
        timedSemaphore3.shutdown();
        long long5 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void TimedSemaphore0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0477");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getAcquireCount();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0478");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) ' ');
        timedSemaphore3.setLimit((int) (byte) 100);
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int8 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void TimedSemaphore0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0479");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(32L, timeUnit1, (int) ' ');
    }

    @Test
    public void TimedSemaphore0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0480");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0481");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        int int6 = timedSemaphore3.getAvailablePermits();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double8 = timedSemaphore3.getAverageCallsPerPeriod();
        long long9 = timedSemaphore3.getPeriod();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void TimedSemaphore0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0482");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 1, timeUnit2, (int) (byte) 10);
    }

    @Test
    public void TimedSemaphore0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0483");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, 100);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        int int6 = timedSemaphore4.getAvailablePermits();
        int int7 = timedSemaphore4.getAvailablePermits();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void TimedSemaphore0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0484");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (byte) 10, timeUnit2, (int) (short) 10);
        int int5 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void TimedSemaphore0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0485");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        int int5 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit((int) (short) 0);
        long long8 = timedSemaphore3.getPeriod();
        double double9 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void TimedSemaphore0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0486");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        int int6 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(10);
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void TimedSemaphore0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0487");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 10);
        int int4 = timedSemaphore3.getAvailablePermits();
        timedSemaphore3.setLimit(1);
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void TimedSemaphore0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0488");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 'a', timeUnit2, (int) ' ');
        int int5 = timedSemaphore4.getAvailablePermits();
        long long6 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void TimedSemaphore0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0489");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, 0);
        long long4 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void TimedSemaphore0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0490");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 0, timeUnit1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0491");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        boolean boolean5 = timedSemaphore3.isShutdown();
        int int6 = timedSemaphore3.getLimit();
        int int7 = timedSemaphore3.getAcquireCount();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
    }

    @Test
    public void TimedSemaphore0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0492");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 1, timeUnit1, (int) ' ');
        timedSemaphore3.setLimit((int) (byte) 100);
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void TimedSemaphore0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0493");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 52, timeUnit1, (int) (short) 10);
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0494");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 32L, timeUnit2, (int) (byte) 0);
    }

    @Test
    public void TimedSemaphore0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0495");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        long long4 = timedSemaphore3.getPeriod();
        long long5 = timedSemaphore3.getPeriod();
        timedSemaphore3.shutdown();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        timedSemaphore3.setLimit(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void TimedSemaphore0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0496");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '4', timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore3.getUnit();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        int int8 = timedSemaphore3.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void TimedSemaphore0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0497");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 1, timeUnit1, (-1));
        timedSemaphore3.setLimit((int) '4');
    }

    @Test
    public void TimedSemaphore0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0498");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.shutdown();
        java.util.concurrent.TimeUnit timeUnit7 = timedSemaphore3.getUnit();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void TimedSemaphore0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0499");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) '#', timeUnit2, (int) ' ');
        timedSemaphore4.setLimit((int) '#');
        // The following exception was thrown during execution in TimedSemaphore generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void TimedSemaphore0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.TimedSemaphore0500");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) 100, timeUnit1, 1);
        int int4 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        boolean boolean6 = timedSemaphore3.isShutdown();
        boolean boolean7 = timedSemaphore3.isShutdown();
        int int8 = timedSemaphore3.getLastAcquiresPerPeriod();
        long long9 = timedSemaphore3.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }
}

