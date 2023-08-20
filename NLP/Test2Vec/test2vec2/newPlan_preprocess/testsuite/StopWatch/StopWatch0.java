package StopWatch;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StopWatch0 {

    public static boolean debug = false;

    @Test
    public void StopWatch0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0001");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0002");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0003");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StopWatch0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0005");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str4 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0006");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long3 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14800L + "'", long2 == 14800L);
    }

    @Test
    public void StopWatch0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0007");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0008");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751596070L + "'", long3 == 1575751596070L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0009");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0010");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0011");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str5 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0012");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long1 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0013");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13700L + "'", long2 == 13700L);
    }

    @Test
    public void StopWatch0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0014");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        java.lang.Class<?> wildcardClass2 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StopWatch0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0015");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751601146L + "'", long3 == 1575751601146L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0016");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0017");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 664500L + "'", long2 == 664500L);
    }

    @Test
    public void StopWatch0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0018");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 44100L + "'", long6 == 44100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0019");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long6 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0020");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751605085L + "'", long3 == 1575751605085L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0021");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751606294L + "'", long3 == 1575751606294L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0022");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long4 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0023");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21700L + "'", long6 == 21700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0024");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 24400L + "'", long6 == 24400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0025");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0026");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 15300L + "'", long7 == 15300L);
    }

    @Test
    public void StopWatch0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0027");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 540700L + "'", long6 == 540700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0028");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 20700L + "'", long6 == 20700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0029");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long4 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3800L + "'", long2 == 3800L);
    }

    @Test
    public void StopWatch0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0030");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16800L + "'", long6 == 16800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0031");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 13300L + "'", long6 == 13300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0032");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass4 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 7900L + "'", long3 == 7900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StopWatch0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0033");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 18800L + "'", long6 == 18800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 24200L + "'", long8 == 24200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 30300L + "'", long9 == 30300L);
    }

    @Test
    public void StopWatch0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0034");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 13800L + "'", long6 == 13800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0035");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long4 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0036");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 12600L + "'", long6 == 12600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0037");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60400L + "'", long9 == 60400L);
    }

    @Test
    public void StopWatch0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0038");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StopWatch0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0039");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10700L + "'", long6 == 10700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0040");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0041");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0042");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 42000L + "'", long6 == 42000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.001" + "'", str9.equals("0:00:00.001"));
    }

    @Test
    public void StopWatch0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0043");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5900L + "'", long3 == 5900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8300L + "'", long4 == 8300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0044");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11800L + "'", long6 == 11800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21900L + "'", long8 == 21900L);
    }

    @Test
    public void StopWatch0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0045");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10600L + "'", long6 == 10600L);
    }

    @Test
    public void StopWatch0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0046");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 49700L + "'", long6 == 49700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0047");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3600L + "'", long2 == 3600L);
    }

    @Test
    public void StopWatch0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0048");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 13400L + "'", long6 == 13400L);
    }

    @Test
    public void StopWatch0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0049");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751625288L + "'", long6 == 1575751625288L);
    }

    @Test
    public void StopWatch0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0050");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10400L + "'", long6 == 10400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0051");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751626286L + "'", long3 == 1575751626286L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 33400L + "'", long6 == 33400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0052");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751626846L + "'", long4 == 1575751626846L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10100L + "'", long5 == 10100L);
    }

    @Test
    public void StopWatch0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0053");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6100L + "'", long3 == 6100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3400L + "'", long4 == 3400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3400L + "'", long5 == 3400L);
    }

    @Test
    public void StopWatch0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0054");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0055");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751629879L + "'", long3 == 1575751629879L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0056");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10900L + "'", long6 == 10900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0057");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 14800L + "'", long6 == 14800L);
    }

    @Test
    public void StopWatch0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0058");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751630913L + "'", long3 == 1575751630913L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0059");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751630962L + "'", long3 == 1575751630962L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 27900L + "'", long6 == 27900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0060");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10000L + "'", long6 == 10000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0061");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751631522L + "'", long4 == 1575751631522L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10900L + "'", long5 == 10900L);
    }

    @Test
    public void StopWatch0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0062");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11500L + "'", long6 == 11500L);
    }

    @Test
    public void StopWatch0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0063");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0064");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 15100L + "'", long6 == 15100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0065");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751634803L + "'", long3 == 1575751634803L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0066");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751634979L + "'", long3 == 1575751634979L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0067");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long6 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751635319L + "'", long3 == 1575751635319L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0068");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0069");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751636780L + "'", long3 == 1575751636780L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0070");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4900L + "'", long3 == 4900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 6800L + "'", long4 == 6800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0071");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0072");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751637864L + "'", long3 == 1575751637864L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 43900L + "'", long7 == 43900L);
    }

    @Test
    public void StopWatch0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0073");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0074");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0075");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751639236L + "'", long4 == 1575751639236L);
    }

    @Test
    public void StopWatch0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0076");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6700L + "'", long3 == 6700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8600L + "'", long4 == 8600L);
    }

    @Test
    public void StopWatch0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0077");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0078");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751640380L + "'", long4 == 1575751640380L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10900L + "'", long5 == 10900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0079");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6100L + "'", long3 == 6100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8100L + "'", long4 == 8100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0080");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0081");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.Class<?> wildcardClass4 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751640998L + "'", long3 == 1575751640998L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StopWatch0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0082");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str1 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0083");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16000L + "'", long6 == 16000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0084");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751642774L + "'", long3 == 1575751642774L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3400L + "'", long7 == 3400L);
    }

    @Test
    public void StopWatch0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0085");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751643535L + "'", long3 == 1575751643535L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8100L + "'", long4 == 8100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751643535L + "'", long8 == 1575751643535L);
    }

    @Test
    public void StopWatch0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0086");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0087");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751644152L + "'", long3 == 1575751644152L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0088");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6400L + "'", long3 == 6400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8500L + "'", long4 == 8500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0089");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 13900L + "'", long6 == 13900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751645131L + "'", long8 == 1575751645131L);
    }

    @Test
    public void StopWatch0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0090");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751646111L + "'", long3 == 1575751646111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0091");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9400L + "'", long7 == 9400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 31600L + "'", long8 == 31600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0092");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0093");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751647400L + "'", long3 == 1575751647400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0094");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0095");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long3 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void StopWatch0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0096");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0097");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 14900L + "'", long6 == 14900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0098");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9600L + "'", long7 == 9600L);
    }

    @Test
    public void StopWatch0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0099");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0100");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751649708L + "'", long3 == 1575751649708L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7800L + "'", long4 == 7800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 48500L + "'", long8 == 48500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 54600L + "'", long9 == 54600L);
    }

    @Test
    public void StopWatch0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0101");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10300L + "'", long6 == 10300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0102");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751650723L + "'", long3 == 1575751650723L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9600L + "'", long4 == 9600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751650723L + "'", long8 == 1575751650723L);
    }

    @Test
    public void StopWatch0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0103");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751650967L + "'", long3 == 1575751650967L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0104");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751651782L + "'", long3 == 1575751651782L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8700L + "'", long4 == 8700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 41900L + "'", long8 == 41900L);
    }

    @Test
    public void StopWatch0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0105");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9900L + "'", long6 == 9900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0106");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8800L + "'", long6 == 8800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0107");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void StopWatch0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0108");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0109");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751653308L + "'", long4 == 1575751653308L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 48700L + "'", long5 == 48700L);
    }

    @Test
    public void StopWatch0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0110");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751653634L + "'", long3 == 1575751653634L);
    }

    @Test
    public void StopWatch0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0111");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11300L + "'", long6 == 11300L);
    }

    @Test
    public void StopWatch0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0112");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751653750L + "'", long3 == 1575751653750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0113");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11500L + "'", long6 == 11500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 16100L + "'", long8 == 16100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0114");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5200L + "'", long3 == 5200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7100L + "'", long4 == 7100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0115");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751654446L + "'", long3 == 1575751654446L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10400L + "'", long4 == 10400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0116");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751654905L + "'", long4 == 1575751654905L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 14100L + "'", long5 == 14100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0117");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751654969L + "'", long3 == 1575751654969L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0118");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 12000L + "'", long8 == 12000L);
    }

    @Test
    public void StopWatch0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0119");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5600L + "'", long3 == 5600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7500L + "'", long4 == 7500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0120");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 302600L + "'", long4 == 302600L);
    }

    @Test
    public void StopWatch0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0121");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 26900L + "'", long6 == 26900L);
    }

    @Test
    public void StopWatch0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0122");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0123");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0124");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 13600L + "'", long6 == 13600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0125");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751658141L + "'", long3 == 1575751658141L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0126");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0127");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
    }

    @Test
    public void StopWatch0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0128");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751658752L + "'", long3 == 1575751658752L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 49600L + "'", long7 == 49600L);
    }

    @Test
    public void StopWatch0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0129");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 27900L + "'", long7 == 27900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0130");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0131");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0132");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 12500L + "'", long6 == 12500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 13800L + "'", long7 == 13800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0133");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getStartTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751662544L + "'", long3 == 1575751662544L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11400L + "'", long4 == 11400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751662544L + "'", long8 == 1575751662544L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0134");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751663149L + "'", long3 == 1575751663149L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8600L + "'", long4 == 8600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0135");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0136");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitNanoTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21300L + "'", long8 == 21300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0137");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4100L + "'", long3 == 4100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9600L + "'", long4 == 9600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StopWatch0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0138");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11400L + "'", long6 == 11400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 15500L + "'", long8 == 15500L);
    }

    @Test
    public void StopWatch0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0139");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11900L + "'", long6 == 11900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0140");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11300L + "'", long7 == 11300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0141");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long5 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0142");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751665868L + "'", long3 == 1575751665868L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 27700L + "'", long6 == 27700L);
    }

    @Test
    public void StopWatch0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0143");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long8 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751669426L + "'", long3 == 1575751669426L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8200L + "'", long4 == 8200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0144");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751669557L + "'", long3 == 1575751669557L);
    }

    @Test
    public void StopWatch0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0145");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751669961L + "'", long3 == 1575751669961L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0146");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751670022L + "'", long3 == 1575751670022L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 15200L + "'", long4 == 15200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 48000L + "'", long9 == 48000L);
    }

    @Test
    public void StopWatch0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0147");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9300L + "'", long6 == 9300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0148");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751670593L + "'", long3 == 1575751670593L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0149");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0150");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751672275L + "'", long3 == 1575751672275L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 26100L + "'", long6 == 26100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28800L + "'", long8 == 28800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0151");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0152");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751672799L + "'", long3 == 1575751672799L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 33100L + "'", long7 == 33100L);
    }

    @Test
    public void StopWatch0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0153");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751673445L + "'", long3 == 1575751673445L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8400L + "'", long4 == 8400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 37100L + "'", long8 == 37100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0154");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751674286L + "'", long3 == 1575751674286L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0155");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751674528L + "'", long6 == 1575751674528L);
    }

    @Test
    public void StopWatch0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0156");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751674747L + "'", long3 == 1575751674747L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 30500L + "'", long7 == 30500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0157");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9900L + "'", long5 == 9900L);
    }

    @Test
    public void StopWatch0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0158");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751675127L + "'", long3 == 1575751675127L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7900L + "'", long4 == 7900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0159");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751675169L + "'", long4 == 1575751675169L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StopWatch0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0160");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9600L + "'", long7 == 9600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9600L + "'", long9 == 9600L);
    }

    @Test
    public void StopWatch0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0161");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10300L + "'", long8 == 10300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0162");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11400L + "'", long5 == 11400L);
    }

    @Test
    public void StopWatch0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0163");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0164");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.start();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751677469L + "'", long3 == 1575751677469L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0165");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long4 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void StopWatch0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0166");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5100L + "'", long3 == 5100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7100L + "'", long4 == 7100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0167");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751678189L + "'", long6 == 1575751678189L);
    }

    @Test
    public void StopWatch0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0168");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751678298L + "'", long3 == 1575751678298L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35200L + "'", long6 == 35200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0169");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0170");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751679145L + "'", long9 == 1575751679145L);
    }

    @Test
    public void StopWatch0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0171");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25300L + "'", long6 == 25300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0172");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8300L + "'", long6 == 8300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8300L + "'", long9 == 8300L);
    }

    @Test
    public void StopWatch0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0173");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0174");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str2 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0175");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5200L + "'", long3 == 5200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2100L + "'", long4 == 2100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2100L + "'", long5 == 2100L);
    }

    @Test
    public void StopWatch0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0176");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0177");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11300L + "'", long6 == 11300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0178");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751680867L + "'", long3 == 1575751680867L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9000L + "'", long4 == 9000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0179");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        long long3 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3300L + "'", long2 == 3300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 5400L + "'", long3 == 5400L);
    }

    @Test
    public void StopWatch0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0180");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
    }

    @Test
    public void StopWatch0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0181");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9500L + "'", long6 == 9500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0182");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0183");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28200L + "'", long7 == 28200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0184");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9800L + "'", long6 == 9800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0185");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10400L + "'", long6 == 10400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0186");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0187");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10300L + "'", long6 == 10300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 16700L + "'", long8 == 16700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751685637L + "'", long9 == 1575751685637L);
    }

    @Test
    public void StopWatch0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0188");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751685776L + "'", long3 == 1575751685776L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0189");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.resume();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10400L + "'", long6 == 10400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 16300L + "'", long8 == 16300L);
    }

    @Test
    public void StopWatch0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0190");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0191");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5700L + "'", long6 == 5700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0192");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751688260L + "'", long3 == 1575751688260L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8300L + "'", long4 == 8300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0193");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8700L + "'", long6 == 8700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8700L + "'", long7 == 8700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0194");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751688726L + "'", long4 == 1575751688726L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11900L + "'", long5 == 11900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0195");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751688843L + "'", long4 == 1575751688843L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 11300L + "'", long5 == 11300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 13800L + "'", long9 == 13800L);
    }

    @Test
    public void StopWatch0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0196");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9700L + "'", long6 == 9700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 121100L + "'", long7 == 121100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0197");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9900L + "'", long6 == 9900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 15500L + "'", long8 == 15500L);
    }

    @Test
    public void StopWatch0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0198");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitNanoTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4700L + "'", long3 == 4700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 6600L + "'", long4 == 6600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2600L + "'", long5 == 2600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2600L + "'", long7 == 2600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0199");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7100L + "'", long6 == 7100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0200");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10800L + "'", long6 == 10800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0201");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751691674L + "'", long3 == 1575751691674L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 26400L + "'", long6 == 26400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 29000L + "'", long8 == 29000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0202");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 24000L + "'", long8 == 24000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 24000L + "'", long9 == 24000L);
    }

    @Test
    public void StopWatch0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0203");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0204");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4800L + "'", long2 == 4800L);
    }

    @Test
    public void StopWatch0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0205");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0206");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0207");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 6700L + "'", long4 == 6700L);
    }

    @Test
    public void StopWatch0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0208");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0209");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751697646L + "'", long3 == 1575751697646L);
    }

    @Test
    public void StopWatch0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0210");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long6 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751697979L + "'", long3 == 1575751697979L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0211");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0212");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751698288L + "'", long6 == 1575751698288L);
    }

    @Test
    public void StopWatch0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0213");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751698502L + "'", long4 == 1575751698502L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9700L + "'", long5 == 9700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0214");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long4 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void StopWatch0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0215");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0216");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0217");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10800L + "'", long6 == 10800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0218");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8800L + "'", long6 == 8800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0219");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4600L + "'", long3 == 4600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 6400L + "'", long4 == 6400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8700L + "'", long6 == 8700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0220");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0221");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6600L + "'", long3 == 6600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9300L + "'", long4 == 9300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0222");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8500L + "'", long7 == 8500L);
    }

    @Test
    public void StopWatch0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0223");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751702299L + "'", long3 == 1575751702299L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0224");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8600L + "'", long6 == 8600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0225");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751702765L + "'", long3 == 1575751702765L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28200L + "'", long7 == 28200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0226");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getStartTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751703284L + "'", long3 == 1575751703284L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751703284L + "'", long6 == 1575751703284L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0227");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8900L + "'", long6 == 8900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0228");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16300L + "'", long6 == 16300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 54000L + "'", long9 == 54000L);
    }

    @Test
    public void StopWatch0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0229");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0230");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 31200L + "'", long9 == 31200L);
    }

    @Test
    public void StopWatch0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0231");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0232");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0233");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7800L + "'", long6 == 7800L);
    }

    @Test
    public void StopWatch0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0234");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0235");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
    }

    @Test
    public void StopWatch0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0236");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7500L + "'", long7 == 7500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 41300L + "'", long9 == 41300L);
    }

    @Test
    public void StopWatch0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0237");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4300L + "'", long3 == 4300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5300L + "'", long4 == 5300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0238");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751708282L + "'", long4 == 1575751708282L);
    }

    @Test
    public void StopWatch0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0239");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0240");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751708676L + "'", long3 == 1575751708676L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 26100L + "'", long6 == 26100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0241");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long6 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0242");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        stopWatch0.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0243");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11200L + "'", long6 == 11200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11800L + "'", long7 == 11800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 48900L + "'", long9 == 48900L);
    }

    @Test
    public void StopWatch0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0244");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11100L + "'", long6 == 11100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0245");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4200L + "'", long3 == 4200L);
    }

    @Test
    public void StopWatch0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0246");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0247");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10300L + "'", long6 == 10300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 15300L + "'", long9 == 15300L);
    }

    @Test
    public void StopWatch0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0248");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0249");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751711287L + "'", long3 == 1575751711287L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751711287L + "'", long7 == 1575751711287L);
    }

    @Test
    public void StopWatch0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0250");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751711483L + "'", long6 == 1575751711483L);
    }

    @Test
    public void StopWatch0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0251");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3700L + "'", long3 == 3700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4800L + "'", long4 == 4800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 24100L + "'", long7 == 24100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0252");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0253");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6500L + "'", long6 == 6500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0254");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751713250L + "'", long3 == 1575751713250L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 38200L + "'", long7 == 38200L);
    }

    @Test
    public void StopWatch0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0255");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751713388L + "'", long3 == 1575751713388L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 19700L + "'", long6 == 19700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0256");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751713510L + "'", long3 == 1575751713510L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22500L + "'", long6 == 22500L);
    }

    @Test
    public void StopWatch0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0257");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 19200L + "'", long6 == 19200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0258");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751714169L + "'", long3 == 1575751714169L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0259");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751714362L + "'", long3 == 1575751714362L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2200L + "'", long4 == 2200L);
    }

    @Test
    public void StopWatch0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0260");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 12800L + "'", long6 == 12800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751715497L + "'", long9 == 1575751715497L);
    }

    @Test
    public void StopWatch0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0261");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitNanoTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 20100L + "'", long8 == 20100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0262");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7700L + "'", long6 == 7700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7700L + "'", long7 == 7700L);
    }

    @Test
    public void StopWatch0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0263");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4000L + "'", long3 == 4000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4900L + "'", long4 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0264");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751716183L + "'", long3 == 1575751716183L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8200L + "'", long4 == 8200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751716183L + "'", long6 == 1575751716183L);
    }

    @Test
    public void StopWatch0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0265");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0266");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751716619L + "'", long3 == 1575751716619L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0267");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751716915L + "'", long3 == 1575751716915L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0268");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long8 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751717168L + "'", long3 == 1575751717168L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0269");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3600L + "'", long3 == 3600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2200L + "'", long4 == 2200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2200L + "'", long5 == 2200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0270");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10700L + "'", long6 == 10700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11400L + "'", long7 == 11400L);
    }

    @Test
    public void StopWatch0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0271");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17500L + "'", long8 == 17500L);
    }

    @Test
    public void StopWatch0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0272");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751717906L + "'", long6 == 1575751717906L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751717906L + "'", long7 == 1575751717906L);
    }

    @Test
    public void StopWatch0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0273");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25200L + "'", long6 == 25200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0274");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751718353L + "'", long3 == 1575751718353L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0275");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0276");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751718666L + "'", long3 == 1575751718666L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 25700L + "'", long7 == 25700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0277");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751718996L + "'", long3 == 1575751718996L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 23800L + "'", long6 == 23800L);
    }

    @Test
    public void StopWatch0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0278");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getStartTime();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751719285L + "'", long5 == 1575751719285L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0279");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long5 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 6300L + "'", long4 == 6300L);
    }

    @Test
    public void StopWatch0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0280");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751719801L + "'", long3 == 1575751719801L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0281");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass3 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StopWatch0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0282");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0283");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10500L + "'", long6 == 10500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0284");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10200L + "'", long6 == 10200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0285");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0286");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11400L + "'", long7 == 11400L);
    }

    @Test
    public void StopWatch0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0287");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9000L + "'", long7 == 9000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 26800L + "'", long9 == 26800L);
    }

    @Test
    public void StopWatch0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0288");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751722118L + "'", long6 == 1575751722118L);
    }

    @Test
    public void StopWatch0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0289");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9500L + "'", long8 == 9500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9500L + "'", long9 == 9500L);
    }

    @Test
    public void StopWatch0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0290");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0291");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 7400L + "'", long3 == 7400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8400L + "'", long4 == 8400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 13600L + "'", long6 == 13600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2300L + "'", long7 == 2300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0292");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 26600L + "'", long9 == 26600L);
    }

    @Test
    public void StopWatch0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0293");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751723152L + "'", long3 == 1575751723152L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0294");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7900L + "'", long6 == 7900L);
    }

    @Test
    public void StopWatch0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0295");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4000L + "'", long3 == 4000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4900L + "'", long4 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0296");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 29900L + "'", long6 == 29900L);
    }

    @Test
    public void StopWatch0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0297");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751723883L + "'", long4 == 1575751723883L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12000L + "'", long5 == 12000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 14800L + "'", long8 == 14800L);
    }

    @Test
    public void StopWatch0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0298");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0299");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9800L + "'", long6 == 9800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0300");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4100L + "'", long3 == 4100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9200L + "'", long6 == 9200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9200L + "'", long7 == 9200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9200L + "'", long9 == 9200L);
    }

    @Test
    public void StopWatch0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0301");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6500L + "'", long3 == 6500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7700L + "'", long4 == 7700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0302");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0303");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751725468L + "'", long4 == 1575751725468L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10900L + "'", long5 == 10900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0304");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long5 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2400L + "'", long2 == 2400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0305");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8600L + "'", long6 == 8600L);
    }

    @Test
    public void StopWatch0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0306");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0307");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0308");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0309");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0310");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751727210L + "'", long3 == 1575751727210L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 27200L + "'", long4 == 27200L);
    }

    @Test
    public void StopWatch0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0311");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5700L + "'", long4 == 5700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StopWatch0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0312");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9200L + "'", long6 == 9200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9200L + "'", long8 == 9200L);
    }

    @Test
    public void StopWatch0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0313");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str6 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751727564L + "'", long3 == 1575751727564L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0314");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8300L + "'", long6 == 8300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0315");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751728056L + "'", long3 == 1575751728056L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8600L + "'", long4 == 8600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0316");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0317");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0318");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3900L + "'", long3 == 3900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5400L + "'", long4 == 5400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 22000L + "'", long7 == 22000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751728479L + "'", long8 == 1575751728479L);
    }

    @Test
    public void StopWatch0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0319");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0320");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22900L + "'", long6 == 22900L);
    }

    @Test
    public void StopWatch0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0321");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751728850L + "'", long3 == 1575751728850L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0322");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751729045L + "'", long3 == 1575751729045L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 38100L + "'", long6 == 38100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0323");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10300L + "'", long6 == 10300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10300L + "'", long8 == 10300L);
    }

    @Test
    public void StopWatch0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0324");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10300L + "'", long6 == 10300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 11200L + "'", long7 == 11200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0325");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751729865L + "'", long3 == 1575751729865L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 22700L + "'", long7 == 22700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2400L + "'", long8 == 2400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751729865L + "'", long9 == 1575751729865L);
    }

    @Test
    public void StopWatch0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0326");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0327");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751730177L + "'", long3 == 1575751730177L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22000L + "'", long6 == 22000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0328");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 16600L + "'", long5 == 16600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0329");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751730511L + "'", long3 == 1575751730511L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 23500L + "'", long6 == 23500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 26300L + "'", long8 == 26300L);
    }

    @Test
    public void StopWatch0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0330");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10100L + "'", long6 == 10100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 12100L + "'", long8 == 12100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0331");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751731148L + "'", long3 == 1575751731148L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7300L + "'", long4 == 7300L);
    }

    @Test
    public void StopWatch0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0332");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        java.lang.String str5 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4200L + "'", long3 == 4200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2500L + "'", long4 == 2500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0333");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4300L + "'", long3 == 4300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5500L + "'", long4 == 5500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7900L + "'", long6 == 7900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2400L + "'", long7 == 2400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0334");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8000L + "'", long6 == 8000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0335");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7200L + "'", long6 == 7200L);
    }

    @Test
    public void StopWatch0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0336");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4200L + "'", long3 == 4200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5100L + "'", long4 == 5100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0337");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751733158L + "'", long3 == 1575751733158L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9100L + "'", long4 == 9100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0338");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751733239L + "'", long3 == 1575751733239L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 56500L + "'", long7 == 56500L);
    }

    @Test
    public void StopWatch0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0339");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751733800L + "'", long3 == 1575751733800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4900L + "'", long4 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751733800L + "'", long8 == 1575751733800L);
    }

    @Test
    public void StopWatch0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0340");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3900L + "'", long3 == 3900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2300L + "'", long4 == 2300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0341");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 30800L + "'", long7 == 30800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0342");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0343");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 20000L + "'", long8 == 20000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0344");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2400L + "'", long3 == 2400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3100L + "'", long4 == 3100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4800L + "'", long6 == 4800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0345");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751735979L + "'", long3 == 1575751735979L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18600L + "'", long7 == 18600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0346");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4800L + "'", long6 == 4800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4800L + "'", long7 == 4800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0347");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0348");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6800L + "'", long6 == 6800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8700L + "'", long8 == 8700L);
    }

    @Test
    public void StopWatch0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0349");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751736814L + "'", long3 == 1575751736814L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0350");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6200L + "'", long6 == 6200L);
    }

    @Test
    public void StopWatch0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0351");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5800L + "'", long6 == 5800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6300L + "'", long7 == 6300L);
    }

    @Test
    public void StopWatch0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0352");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751737344L + "'", long3 == 1575751737344L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21000L + "'", long7 == 21000L);
    }

    @Test
    public void StopWatch0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0353");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751737441L + "'", long3 == 1575751737441L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0354");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5800L + "'", long6 == 5800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0355");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751737866L + "'", long4 == 1575751737866L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0356");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1300L + "'", long3 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6500L + "'", long5 == 6500L);
    }

    @Test
    public void StopWatch0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0357");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751738452L + "'", long3 == 1575751738452L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0358");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9000L + "'", long7 == 9000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0359");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 19300L + "'", long8 == 19300L);
    }

    @Test
    public void StopWatch0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0360");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751738980L + "'", long3 == 1575751738980L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 18300L + "'", long6 == 18300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0361");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751739099L + "'", long3 == 1575751739099L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0362");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5100L + "'", long8 == 5100L);
    }

    @Test
    public void StopWatch0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0363");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 24500L + "'", long8 == 24500L);
    }

    @Test
    public void StopWatch0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0364");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751740801L + "'", long2 == 1575751740801L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
    }

    @Test
    public void StopWatch0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0365");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751741119L + "'", long3 == 1575751741119L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0366");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751741581L + "'", long3 == 1575751741581L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0367");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        long long3 = stopWatch0.getNanoTime();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str5 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2200L + "'", long3 == 2200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0368");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5600L + "'", long6 == 5600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0369");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7100L + "'", long6 == 7100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0370");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        java.lang.String str7 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751742179L + "'", long3 == 1575751742179L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4000L + "'", long4 == 4000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0371");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751742315L + "'", long4 == 1575751742315L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0372");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3000L + "'", long3 == 3000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1500L + "'", long4 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751742458L + "'", long8 == 1575751742458L);
    }

    @Test
    public void StopWatch0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0373");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long8 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751742746L + "'", long3 == 1575751742746L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0374");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6100L + "'", long6 == 6100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0375");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751743156L + "'", long3 == 1575751743156L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 18100L + "'", long6 == 18100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0376");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2100L + "'", long5 == 2100L);
    }

    @Test
    public void StopWatch0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0377");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0378");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6400L + "'", long6 == 6400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0379");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700L + "'", long5 == 1700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0380");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751745723L + "'", long3 == 1575751745723L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17000L + "'", long7 == 17000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1400L + "'", long8 == 1400L);
    }

    @Test
    public void StopWatch0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0381");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751745839L + "'", long3 == 1575751745839L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
    }

    @Test
    public void StopWatch0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0382");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751746162L + "'", long4 == 1575751746162L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5200L + "'", long5 == 5200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8300L + "'", long8 == 8300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751746162L + "'", long9 == 1575751746162L);
    }

    @Test
    public void StopWatch0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0383");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4200L + "'", long6 == 4200L);
    }

    @Test
    public void StopWatch0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0384");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4600L + "'", long6 == 4600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0385");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4600L + "'", long6 == 4600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1400L + "'", long7 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1400L + "'", long8 == 1400L);
    }

    @Test
    public void StopWatch0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0386");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0387");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751747065L + "'", long3 == 1575751747065L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16000L + "'", long6 == 16000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0388");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751747166L + "'", long3 == 1575751747166L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4400L + "'", long4 == 4400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2000L + "'", long5 == 2000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9400L + "'", long7 == 9400L);
    }

    @Test
    public void StopWatch0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0389");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751747639L + "'", long3 == 1575751747639L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8000L + "'", long9 == 8000L);
    }

    @Test
    public void StopWatch0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0390");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751747795L + "'", long3 == 1575751747795L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18100L + "'", long7 == 18100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0391");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7100L + "'", long6 == 7100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7700L + "'", long7 == 7700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751748074L + "'", long9 == 1575751748074L);
    }

    @Test
    public void StopWatch0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0392");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751748198L + "'", long3 == 1575751748198L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0393");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751748359L + "'", long3 == 1575751748359L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 15700L + "'", long6 == 15700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0394");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5500L + "'", long6 == 5500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0395");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 23900L + "'", long7 == 23900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0396");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751748884L + "'", long3 == 1575751748884L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0397");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6300L + "'", long6 == 6300L);
    }

    @Test
    public void StopWatch0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0398");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751749126L + "'", long3 == 1575751749126L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4600L + "'", long4 == 4600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751749126L + "'", long8 == 1575751749126L);
    }

    @Test
    public void StopWatch0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0399");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751749205L + "'", long4 == 1575751749205L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0400");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str5 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751749472L + "'", long2 == 1575751749472L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
    }

    @Test
    public void StopWatch0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0401");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0402");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751750033L + "'", long3 == 1575751750033L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4400L + "'", long4 == 4400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0403");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long8 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751750169L + "'", long8 == 1575751750169L);
    }

    @Test
    public void StopWatch0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0404");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6000L + "'", long6 == 6000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6500L + "'", long7 == 6500L);
    }

    @Test
    public void StopWatch0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0405");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3100L + "'", long3 == 3100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 19900L + "'", long7 == 19900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 19900L + "'", long9 == 19900L);
    }

    @Test
    public void StopWatch0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0406");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6800L + "'", long6 == 6800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0407");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5500L + "'", long6 == 5500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0408");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0409");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0410");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getStartTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3100L + "'", long3 == 3100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1600L + "'", long4 == 1600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1600L + "'", long5 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751751807L + "'", long8 == 1575751751807L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1600L + "'", long9 == 1600L);
    }

    @Test
    public void StopWatch0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0411");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0412");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6000L + "'", long6 == 6000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0413");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751752297L + "'", long3 == 1575751752297L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 17400L + "'", long6 == 17400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0414");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751753045L + "'", long3 == 1575751753045L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0415");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751753196L + "'", long3 == 1575751753196L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0416");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5300L + "'", long6 == 5300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0417");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751753418L + "'", long4 == 1575751753418L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4900L + "'", long5 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6700L + "'", long8 == 6700L);
    }

    @Test
    public void StopWatch0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0418");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751753545L + "'", long4 == 1575751753545L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5300L + "'", long5 == 5300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8500L + "'", long8 == 8500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8500L + "'", long9 == 8500L);
    }

    @Test
    public void StopWatch0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0419");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5400L + "'", long6 == 5400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0420");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751753938L + "'", long4 == 1575751753938L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0421");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6500L + "'", long6 == 6500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7100L + "'", long7 == 7100L);
    }

    @Test
    public void StopWatch0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0422");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 15700L + "'", long8 == 15700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751754164L + "'", long9 == 1575751754164L);
    }

    @Test
    public void StopWatch0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0423");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751754326L + "'", long3 == 1575751754326L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16800L + "'", long6 == 16800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1400L + "'", long8 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751754326L + "'", long9 == 1575751754326L);
    }

    @Test
    public void StopWatch0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0424");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0425");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0426");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751755057L + "'", long4 == 1575751755057L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5500L + "'", long5 == 5500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751755057L + "'", long9 == 1575751755057L);
    }

    @Test
    public void StopWatch0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0427");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4400L + "'", long3 == 4400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0428");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3100L + "'", long3 == 3100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3800L + "'", long4 == 3800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5500L + "'", long6 == 5500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0429");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751755692L + "'", long3 == 1575751755692L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751755692L + "'", long9 == 1575751755692L);
    }

    @Test
    public void StopWatch0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0430");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitNanoTime();
        java.lang.String str8 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600L + "'", long4 == 3600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1400L + "'", long5 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1400L + "'", long7 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0431");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0432");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751756514L + "'", long3 == 1575751756514L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751756514L + "'", long9 == 1575751756514L);
    }

    @Test
    public void StopWatch0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0433");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0434");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5300L + "'", long6 == 5300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0435");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751757130L + "'", long3 == 1575751757130L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0436");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4500L + "'", long6 == 4500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0437");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5400L + "'", long7 == 5400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0438");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751758688L + "'", long4 == 1575751758688L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0439");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0440");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
    }

    @Test
    public void StopWatch0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0441");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751759809L + "'", long3 == 1575751759809L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4700L + "'", long4 == 4700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751759809L + "'", long6 == 1575751759809L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7200L + "'", long7 == 7200L);
    }

    @Test
    public void StopWatch0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0442");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751759917L + "'", long3 == 1575751759917L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0443");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751760265L + "'", long6 == 1575751760265L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0444");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751760344L + "'", long3 == 1575751760344L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0445");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751760424L + "'", long4 == 1575751760424L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0446");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0447");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751761796L + "'", long8 == 1575751761796L);
    }

    @Test
    public void StopWatch0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0448");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751761917L + "'", long3 == 1575751761917L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6900L + "'", long7 == 6900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0449");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3400L + "'", long4 == 3400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1400L + "'", long5 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7700L + "'", long6 == 7700L);
    }

    @Test
    public void StopWatch0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0450");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751762103L + "'", long3 == 1575751762103L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 17500L + "'", long6 == 17500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0451");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0452");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5100L + "'", long6 == 5100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0453");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751762713L + "'", long3 == 1575751762713L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0454");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StopWatch0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0455");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751763182L + "'", long4 == 1575751763182L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0456");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5100L + "'", long4 == 5100L);
    }

    @Test
    public void StopWatch0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0457");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long8 = stopWatch0.getStartTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751763587L + "'", long3 == 1575751763587L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4700L + "'", long4 == 4700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751763587L + "'", long8 == 1575751763587L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0458");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long8 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751763954L + "'", long3 == 1575751763954L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 20700L + "'", long6 == 20700L);
    }

    @Test
    public void StopWatch0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0459");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751764082L + "'", long3 == 1575751764082L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0460");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751764991L + "'", long3 == 1575751764991L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4600L + "'", long4 == 4600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751764991L + "'", long6 == 1575751764991L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751764991L + "'", long8 == 1575751764991L);
    }

    @Test
    public void StopWatch0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0461");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1300L + "'", long3 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4200L + "'", long4 == 4200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0462");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0463");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751765871L + "'", long4 == 1575751765871L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0464");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0465");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3100L + "'", long3 == 3100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700L + "'", long4 == 1700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700L + "'", long5 == 1700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0466");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0467");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0468");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5100L + "'", long6 == 5100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751767820L + "'", long9 == 1575751767820L);
    }

    @Test
    public void StopWatch0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0469");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5100L + "'", long7 == 5100L);
    }

    @Test
    public void StopWatch0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0470");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751768052L + "'", long3 == 1575751768052L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4600L + "'", long4 == 4600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0471");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0472");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4800L + "'", long6 == 4800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0473");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5100L + "'", long6 == 5100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0474");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0475");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0476");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 14700L + "'", long8 == 14700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0477");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5600L + "'", long7 == 5600L);
    }

    @Test
    public void StopWatch0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0478");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751770307L + "'", long3 == 1575751770307L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0479");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0480");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751770998L + "'", long3 == 1575751770998L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4000L + "'", long4 == 4000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
    }

    @Test
    public void StopWatch0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0481");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751771116L + "'", long4 == 1575751771116L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6400L + "'", long5 == 6400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0482");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 18100L + "'", long6 == 18100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0483");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751771515L + "'", long3 == 1575751771515L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4300L + "'", long4 == 4300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7300L + "'", long7 == 7300L);
    }

    @Test
    public void StopWatch0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0484");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        stopWatch0.start();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751771701L + "'", long3 == 1575751771701L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0485");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751772072L + "'", long4 == 1575751772072L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11400L + "'", long6 == 11400L);
    }

    @Test
    public void StopWatch0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0486");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
    }

    @Test
    public void StopWatch0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0487");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800L + "'", long4 == 1800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800L + "'", long6 == 1800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0488");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751772758L + "'", long3 == 1575751772758L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 22700L + "'", long7 == 22700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700L + "'", long8 == 1700L);
    }

    @Test
    public void StopWatch0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0489");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0490");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751773212L + "'", long3 == 1575751773212L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StopWatch0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0491");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void StopWatch0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0492");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6200L + "'", long6 == 6200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0493");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getStartTime();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751773879L + "'", long3 == 1575751773879L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4800L + "'", long4 == 4800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751773879L + "'", long8 == 1575751773879L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0494");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 34500L + "'", long7 == 34500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0495");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0496");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
    }

    @Test
    public void StopWatch0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0497");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StopWatch0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0498");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 23600L + "'", long9 == 23600L);
    }

    @Test
    public void StopWatch0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0499");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getStartTime();
        java.lang.Class<?> wildcardClass4 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751775144L + "'", long2 == 1575751775144L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751775144L + "'", long3 == 1575751775144L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StopWatch0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.StopWatch0500");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long9 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751775688L + "'", long3 == 1575751775688L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16300L + "'", long6 == 16300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }
}
