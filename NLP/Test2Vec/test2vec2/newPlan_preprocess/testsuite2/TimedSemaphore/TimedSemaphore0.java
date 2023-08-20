package TimedSemaphore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimedSemaphore0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test01");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 0, timeUnit2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test02");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.lang.Class<?> wildcardClass4 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test03");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore3.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test04");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        java.lang.Class<?> wildcardClass5 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test05");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (-1), timeUnit2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test06");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 10, timeUnit2, (int) (byte) 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test07");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.shutdown();
        int int7 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test08");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, 0L, timeUnit2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test09");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        boolean boolean7 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test10");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        int int7 = timedSemaphore4.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test11");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (byte) 0, timeUnit1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test12");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 0, timeUnit2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test13");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        // The following exception was thrown during execution in test generation
        try {
            timedSemaphore4.acquire();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test14");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.setLimit((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test15");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 100, timeUnit2, (int) (byte) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test16");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        timedSemaphore4.shutdown();
        timedSemaphore4.setLimit((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test17");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) -1, timeUnit1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test18");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        long long5 = timedSemaphore3.getPeriod();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test19");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        boolean boolean7 = timedSemaphore3.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test20");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test21");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        int int5 = timedSemaphore4.getAcquireCount();
        java.util.concurrent.TimeUnit timeUnit6 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test22");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        int int5 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test23");
        int int0 = org.apache.commons.lang3.concurrent.TimedSemaphore.NO_LIMIT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test24");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        java.util.concurrent.TimeUnit timeUnit5 = timedSemaphore4.getUnit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test25");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.shutdown();
        long long7 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test26");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.setLimit((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test27");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test28");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        java.lang.Class<?> wildcardClass7 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test29");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test30");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        timedSemaphore4.shutdown();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test31");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getLimit();
        boolean boolean7 = timedSemaphore4.isShutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test32");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        double double7 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test33");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) ' ', timeUnit2, (int) '#');
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test34");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) '#', timeUnit1, (int) ' ');
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test35");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getAcquireCount();
        timedSemaphore3.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test36");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore(0L, timeUnit1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time period must be greater 0!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test37");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        long long5 = timedSemaphore3.getPeriod();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test38");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        double double5 = timedSemaphore3.getAverageCallsPerPeriod();
        double double6 = timedSemaphore3.getAverageCallsPerPeriod();
        int int7 = timedSemaphore3.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test39");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getAcquireCount();
        long long7 = timedSemaphore3.getPeriod();
        java.lang.Class<?> wildcardClass8 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test40");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.lang.Class<?> wildcardClass6 = timedSemaphore3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test41");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) ' ', timeUnit1, (int) (byte) 10);
        double double4 = timedSemaphore3.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test42");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        int int5 = timedSemaphore4.getAcquireCount();
        int int6 = timedSemaphore4.getAvailablePermits();
        int int7 = timedSemaphore4.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test43");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        timedSemaphore4.shutdown();
        int int7 = timedSemaphore4.getLimit();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test44");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        timedSemaphore3.setLimit((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test45");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        double double7 = timedSemaphore4.getAverageCallsPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test46");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test47");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        int int5 = timedSemaphore4.getAcquireCount();
        timedSemaphore4.setLimit(10);
        int int8 = timedSemaphore4.getAcquireCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test48");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        int int4 = timedSemaphore3.getAcquireCount();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getAcquireCount();
        long long7 = timedSemaphore3.getPeriod();
        int int8 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test49");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        boolean boolean6 = timedSemaphore4.isShutdown();
        timedSemaphore4.shutdown();
        timedSemaphore4.setLimit((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test50");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getLimit();
        timedSemaphore4.shutdown();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test51");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, 1);
        double double5 = timedSemaphore4.getAverageCallsPerPeriod();
        long long6 = timedSemaphore4.getPeriod();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test52");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) 1, timeUnit2, (int) (short) 10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test53");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        timedSemaphore3.shutdown();
        int int7 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test54");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int6 = timedSemaphore3.getLastAcquiresPerPeriod();
        int int7 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test55");
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService0 = null;
        java.util.concurrent.TimeUnit timeUnit2 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore4 = new org.apache.commons.lang3.concurrent.TimedSemaphore(scheduledExecutorService0, (long) (short) 1, timeUnit2, (int) (byte) 100);
        long long5 = timedSemaphore4.getPeriod();
        int int6 = timedSemaphore4.getAcquireCount();
        int int7 = timedSemaphore4.getAvailablePermits();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TimedSemaphore0.test56");
        java.util.concurrent.TimeUnit timeUnit1 = null;
        org.apache.commons.lang3.concurrent.TimedSemaphore timedSemaphore3 = new org.apache.commons.lang3.concurrent.TimedSemaphore((long) (short) 10, timeUnit1, (-1));
        java.util.concurrent.TimeUnit timeUnit4 = timedSemaphore3.getUnit();
        int int5 = timedSemaphore3.getLastAcquiresPerPeriod();
        long long6 = timedSemaphore3.getPeriod();
        int int7 = timedSemaphore3.getLastAcquiresPerPeriod();
        java.util.concurrent.TimeUnit timeUnit8 = timedSemaphore3.getUnit();
        int int9 = timedSemaphore3.getLimit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timeUnit8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }
}

