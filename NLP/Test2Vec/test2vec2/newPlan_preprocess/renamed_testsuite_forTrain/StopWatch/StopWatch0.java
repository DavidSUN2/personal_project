
package StopWatch;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StopWatch0 {

    public static boolean debug = false;

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0001");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0002");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0003");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0005");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0006");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0007");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0008");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0009");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0010");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0011");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0012");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in test generation
        try {
            long long1 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0013");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0014");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        java.lang.Class<?> wildcardClass2 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0015");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0016");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0017");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0018");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0019");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0020");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0021");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0022");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0023");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0024");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0025");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0026");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0027");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0028");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0029");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0030");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0031");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0032");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0033");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0034");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0035");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0036");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0037");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0038");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0039");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0040");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0041");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0042");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0043");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0044");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0045");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0046");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0047");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0048");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0049");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0050");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0051");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0052");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0053");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0054");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0055");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0056");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0057");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0058");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0059");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0060");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0061");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0062");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0063");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0064");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0065");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0066");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0067");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0068");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0069");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0070");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0071");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0072");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0073");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0074");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0075");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0076");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0077");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0078");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0079");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0080");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0081");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0082");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0083");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0084");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0085");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0086");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0087");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0088");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0089");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0090");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0091");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0092");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0093");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0094");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0095");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0096");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0097");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0098");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0099");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0100");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0101");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0102");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0103");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0104");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0105");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0106");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0107");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0108");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0109");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0110");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0111");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0112");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0113");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0114");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0115");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0116");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0117");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0118");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0119");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0120");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0121");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0122");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0123");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0124");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0125");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0126");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0127");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0128");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0129");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0130");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0131");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0132");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0133");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0134");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0135");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0136");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0137");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0138");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0139");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0140");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0141");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0142");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0143");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0144");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0145");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0146");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0147");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0148");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0149");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0150");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0151");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0152");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0153");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0154");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0155");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0156");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0157");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0158");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0159");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0160");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0161");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0162");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0163");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0164");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0165");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0166");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0167");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0168");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0169");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0170");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0171");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0172");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0173");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0174");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0175");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0176");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0177");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0178");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0179");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        long long3 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0180");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0181");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0182");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0183");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0184");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0185");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0186");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0187");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0188");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0189");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0190");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0191");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0192");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0193");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0194");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0195");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0196");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0197");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0198");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0199");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0200");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0201");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0202");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0203");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0204");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0205");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0206");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0207");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0208");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0209");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0210");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0211");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0212");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0213");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0214");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0215");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0216");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0217");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0218");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0219");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0220");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0221");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0222");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0223");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0224");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0225");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0226");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0227");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0228");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0229");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0230");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0231");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0232");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0233");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0234");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0235");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0236");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0237");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0238");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0239");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0240");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0241");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0242");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0243");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0244");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0245");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0246");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0247");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0248");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0249");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0250");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0251");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0252");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0253");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0254");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0255");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0256");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0257");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0258");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0259");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0260");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0261");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0262");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0263");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0264");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0265");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0266");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0267");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0268");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0269");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0270");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0271");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0272");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0273");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0274");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0275");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0276");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0277");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0278");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0279");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0280");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0281");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass3 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0282");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0283");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0284");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0285");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0286");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0287");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0288");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0289");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0290");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0291");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0292");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0293");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0294");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0295");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0296");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0297");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0298");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0299");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0300");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0301");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0302");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0303");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0304");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0305");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0306");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0307");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0308");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0309");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0310");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0311");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0312");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0313");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0314");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0315");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0316");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0317");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0318");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0319");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0320");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0321");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0322");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0323");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0324");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0325");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0326");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0327");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0328");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0329");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0330");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0331");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0332");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0333");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0334");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0335");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0336");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0337");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0338");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0339");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0340");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0341");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0342");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0343");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0344");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0345");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0346");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0347");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0348");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0349");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0350");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0351");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0352");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0353");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0354");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0355");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0356");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0357");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0358");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0359");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0360");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0361");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0362");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0363");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0364");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0365");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0366");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0367");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        long long3 = stopWatch0.getNanoTime();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0368");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0369");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0370");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0371");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0372");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0373");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0374");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0375");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0376");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0377");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0378");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0379");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0380");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0381");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0382");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0383");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0384");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0385");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0386");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0387");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0388");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0389");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0390");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0391");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0392");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0393");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0394");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0395");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0396");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0397");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0398");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0399");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0400");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0401");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0402");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0403");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long8 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0404");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0405");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0406");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0407");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0408");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0409");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0410");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0411");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0412");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0413");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0414");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0415");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0416");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0417");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0418");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0419");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0420");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0421");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0422");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0423");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0424");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0425");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0426");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0427");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0428");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0429");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0430");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0431");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0432");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0433");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0434");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0435");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0436");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0437");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0438");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0439");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0440");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0441");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0442");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0443");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0444");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0445");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0446");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0447");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0448");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0449");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0450");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0451");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0452");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0453");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0454");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0455");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0456");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0457");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0458");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0459");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0460");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0461");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0462");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0463");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0464");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0465");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0466");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0467");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0468");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0469");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0470");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0471");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0472");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0473");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0474");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0475");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0476");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0477");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0478");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0479");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0480");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0481");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0482");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0483");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0484");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0485");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0486");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0487");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0488");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0489");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0490");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0491");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0492");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0493");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0494");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0495");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0496");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0497");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0498");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0499");
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
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch0.test0500");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
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
