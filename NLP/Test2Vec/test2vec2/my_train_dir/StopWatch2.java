
package StopWatch;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StopWatch2 {

    public static boolean debug = false;

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1001");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1600L + "'", long2 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1002");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751896084L + "'", long4 == 1575751896084L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1003");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getStartTime();
        stopWatch0.reset();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751896249L + "'", long6 == 1575751896249L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751896249L + "'", long7 == 1575751896249L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1004");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751896483L + "'", long4 == 1575751896483L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1005");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3100L + "'", long4 == 3100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1006");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751896856L + "'", long3 == 1575751896856L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16500L + "'", long6 == 16500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1007");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3400L + "'", long3 == 3400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4000L + "'", long4 == 4000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700L + "'", long5 == 1700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21200L + "'", long8 == 21200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1008");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long8 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6400L + "'", long6 == 6400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751897237L + "'", long8 == 1575751897237L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1009");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getStartTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751897393L + "'", long3 == 1575751897393L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751897393L + "'", long8 == 1575751897393L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1010");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751897663L + "'", long6 == 1575751897663L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1011");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        java.lang.String str5 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1400L + "'", long2 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1012");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4800L + "'", long6 == 4800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751898001L + "'", long8 == 1575751898001L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1013");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751898310L + "'", long3 == 1575751898310L);
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
            System.out.format("%n%s%n", "StopWatch2.test1014");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751898492L + "'", long4 == 1575751898492L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1015");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2400L + "'", long5 == 2400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2400L + "'", long6 == 2400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1016");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1200L + "'", long4 == 1200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8500L + "'", long7 == 8500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1017");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751898966L + "'", long2 == 1575751898966L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751898966L + "'", long3 == 1575751898966L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1018");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1019");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
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
            System.out.format("%n%s%n", "StopWatch2.test1020");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        long long3 = stopWatch0.getNanoTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2200L + "'", long2 == 2200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1021");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751900104L + "'", long3 == 1575751900104L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4000L + "'", long4 == 4000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1022");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751900345L + "'", long4 == 1575751900345L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1023");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3400L + "'", long4 == 3400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1024");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751900902L + "'", long3 == 1575751900902L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1500L + "'", long8 == 1500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1025");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1400L + "'", long3 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1026");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5900L + "'", long7 == 5900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5900L + "'", long8 == 5900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1027");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751901482L + "'", long3 == 1575751901482L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751901482L + "'", long6 == 1575751901482L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1028");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751901721L + "'", long6 == 1575751901721L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1029");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.start();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751901955L + "'", long3 == 1575751901955L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1030");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6600L + "'", long6 == 6600L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1031");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3400L + "'", long4 == 3400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1032");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17000L + "'", long7 == 17000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1033");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3100L + "'", long3 == 3100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3700L + "'", long4 == 3700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5500L + "'", long6 == 5500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 18300L + "'", long9 == 18300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1034");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1300L + "'", long3 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1035");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass3 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1036");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751903399L + "'", long3 == 1575751903399L);
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
            System.out.format("%n%s%n", "StopWatch2.test1037");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getNanoTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 16000L + "'", long5 == 16000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 21000L + "'", long8 == 21000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1038");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1039");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751904016L + "'", long3 == 1575751904016L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1040");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751904139L + "'", long3 == 1575751904139L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3800L + "'", long4 == 3800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1400L + "'", long9 == 1400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1041");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751904348L + "'", long3 == 1575751904348L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751904348L + "'", long6 == 1575751904348L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751904348L + "'", long9 == 1575751904348L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1042");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751904566L + "'", long4 == 1575751904566L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7200L + "'", long5 == 7200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1043");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751904736L + "'", long3 == 1575751904736L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4300L + "'", long4 == 4300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
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
            System.out.format("%n%s%n", "StopWatch2.test1044");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751904907L + "'", long4 == 1575751904907L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1045");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 15900L + "'", long5 == 15900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1046");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600L + "'", long4 == 3600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1047");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1048");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 14500L + "'", long6 == 14500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 14500L + "'", long7 == 14500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751905482L + "'", long9 == 1575751905482L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1049");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1400L + "'", long4 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1400L + "'", long6 == 1400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1050");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1051");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751905964L + "'", long3 == 1575751905964L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4300L + "'", long4 == 4300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6900L + "'", long8 == 6900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1052");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
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
            System.out.format("%n%s%n", "StopWatch2.test1053");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751906362L + "'", long3 == 1575751906362L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4300L + "'", long4 == 4300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1054");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1400L + "'", long4 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1400L + "'", long5 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1055");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1056");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751907182L + "'", long4 == 1575751907182L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5600L + "'", long5 == 5600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 7900L + "'", long8 == 7900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1057");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3100L + "'", long3 == 3100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5200L + "'", long6 == 5200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5200L + "'", long7 == 5200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751907327L + "'", long9 == 1575751907327L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1058");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751907456L + "'", long6 == 1575751907456L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6500L + "'", long8 == 6500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1059");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751907594L + "'", long3 == 1575751907594L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1060");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751907714L + "'", long6 == 1575751907714L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1061");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getSplitNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 36800L + "'", long9 == 36800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1062");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751908138L + "'", long4 == 1575751908138L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1063");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800L + "'", long2 == 1800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16300L + "'", long6 == 16300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 16300L + "'", long7 == 16300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1064");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1065");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751908653L + "'", long8 == 1575751908653L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1066");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 14700L + "'", long8 == 14700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1067");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        long long5 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1068");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3700L + "'", long4 == 3700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1069");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751909406L + "'", long3 == 1575751909406L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1500L + "'", long7 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1070");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1500L + "'", long7 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1500L + "'", long8 == 1500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1071");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751909748L + "'", long3 == 1575751909748L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3700L + "'", long4 == 3700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 25900L + "'", long9 == 25900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1072");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3200L + "'", long3 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751909935L + "'", long6 == 1575751909935L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6800L + "'", long7 == 6800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1073");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751910107L + "'", long3 == 1575751910107L);
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
            System.out.format("%n%s%n", "StopWatch2.test1074");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1500L + "'", long3 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4200L + "'", long4 == 4200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1075");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toSplitString();
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
            System.out.format("%n%s%n", "StopWatch2.test1076");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5300L + "'", long6 == 5300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5300L + "'", long8 == 5300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10700L + "'", long9 == 10700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1077");
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
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
            System.out.format("%n%s%n", "StopWatch2.test1078");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5500L + "'", long6 == 5500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5500L + "'", long8 == 5500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1079");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751911386L + "'", long3 == 1575751911386L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1200L + "'", long6 == 1200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1080");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 19000L + "'", long9 == 19000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1081");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1082");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1083");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4600L + "'", long6 == 4600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1084");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751914142L + "'", long3 == 1575751914142L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751914142L + "'", long6 == 1575751914142L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1085");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getStartTime();
        long long6 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751914303L + "'", long5 == 1575751914303L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1900L + "'", long6 == 1900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1086");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getStartTime();
        long long6 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751914464L + "'", long5 == 1575751914464L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1087");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5200L + "'", long7 == 5200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1088");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751914760L + "'", long3 == 1575751914760L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 15300L + "'", long6 == 15300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1089");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1600L + "'", long2 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11200L + "'", long4 == 11200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1090");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1400L + "'", long2 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5400L + "'", long6 == 5400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1091");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5300L + "'", long7 == 5300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1092");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
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
            System.out.format("%n%s%n", "StopWatch2.test1093");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1094");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getNanoTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1200L + "'", long3 == 1200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4800L + "'", long5 == 4800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1095");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751916043L + "'", long3 == 1575751916043L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1096");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.suspend();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751916195L + "'", long4 == 1575751916195L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1097");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1500L + "'", long3 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4200L + "'", long4 == 4200L);
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
            System.out.format("%n%s%n", "StopWatch2.test1098");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751916518L + "'", long4 == 1575751916518L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5500L + "'", long5 == 5500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1400L + "'", long6 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1099");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700L + "'", long2 == 1700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1300L + "'", long7 == 1300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1100");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3700L + "'", long4 == 3700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1101");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        java.lang.Class<?> wildcardClass3 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751917169L + "'", long2 == 1575751917169L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1102");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getStartTime();
        long long6 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751917317L + "'", long4 == 1575751917317L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751917317L + "'", long5 == 1575751917317L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1400L + "'", long6 == 1400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1103");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751917433L + "'", long8 == 1575751917433L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1104");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1300L + "'", long6 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1105");
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
            long long8 = stopWatch0.getSplitNanoTime();
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
            System.out.format("%n%s%n", "StopWatch2.test1106");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
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
            System.out.format("%n%s%n", "StopWatch2.test1107");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getStartTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751918220L + "'", long5 == 1575751918220L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751918220L + "'", long6 == 1575751918220L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1108");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1109");
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
            long long8 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751918527L + "'", long3 == 1575751918527L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1110");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
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
            System.out.format("%n%s%n", "StopWatch2.test1111");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1500L + "'", long3 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4200L + "'", long4 == 4200L);
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
            System.out.format("%n%s%n", "StopWatch2.test1112");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1200L + "'", long3 == 1200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1113");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751919224L + "'", long2 == 1575751919224L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1114");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751919394L + "'", long3 == 1575751919394L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3800L + "'", long4 == 3800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1115");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751919590L + "'", long3 == 1575751919590L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1116");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1117");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751920038L + "'", long4 == 1575751920038L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5600L + "'", long7 == 5600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5600L + "'", long8 == 5600L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1118");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitNanoTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18400L + "'", long7 == 18400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1119");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5100L + "'", long6 == 5100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1120");
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
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5200L + "'", long6 == 5200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1121");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751920884L + "'", long4 == 1575751920884L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1122");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        stopWatch0.resume();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751921061L + "'", long4 == 1575751921061L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1123");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = stopWatch0.toSplitString();
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
            System.out.format("%n%s%n", "StopWatch2.test1124");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1125");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        java.lang.String str4 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1126");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751921884L + "'", long3 == 1575751921884L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1127");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5100L + "'", long6 == 5100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5100L + "'", long9 == 5100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1128");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 15400L + "'", long5 == 15400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1129");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long8 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3700L + "'", long8 == 3700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1130");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getStartTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751922629L + "'", long7 == 1575751922629L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1131");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5700L + "'", long6 == 5700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5700L + "'", long8 == 5700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1132");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751923066L + "'", long4 == 1575751923066L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1133");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600L + "'", long6 == 3600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1134");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        long long8 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 15600L + "'", long8 == 15600L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1135");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1500L + "'", long3 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4400L + "'", long4 == 4400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1500L + "'", long6 == 1500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1136");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600L + "'", long4 == 3600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 15600L + "'", long7 == 15600L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1137");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str3 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1138");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 17800L + "'", long6 == 17800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1139");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getStartTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751924463L + "'", long8 == 1575751924463L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1140");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5900L + "'", long5 == 5900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1141");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751924774L + "'", long4 == 1575751924774L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1142");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751924904L + "'", long3 == 1575751924904L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 16100L + "'", long5 == 16100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1143");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3100L + "'", long4 == 3100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1144");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 14000L + "'", long5 == 14000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1145");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751925508L + "'", long2 == 1575751925508L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751925508L + "'", long3 == 1575751925508L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751925508L + "'", long5 == 1575751925508L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1146");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5600L + "'", long5 == 5600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1147");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1148");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600L + "'", long4 == 3600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5400L + "'", long6 == 5400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1500L + "'", long7 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1149");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        long long1 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1150");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2200L + "'", long6 == 2200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1151");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3300L + "'", long4 == 3300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1300L + "'", long8 == 1300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1152");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        long long8 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751926682L + "'", long3 == 1575751926682L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 19500L + "'", long8 == 19500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1153");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1154");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1500L + "'", long4 == 1500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1155");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1156");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitNanoTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751927419L + "'", long3 == 1575751927419L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5900L + "'", long4 == 5900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8700L + "'", long8 == 8700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1157");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1158");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getSplitNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751927685L + "'", long6 == 1575751927685L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1300L + "'", long7 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1159");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
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
            System.out.format("%n%s%n", "StopWatch2.test1160");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getNanoTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 15100L + "'", long5 == 15100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21300L + "'", long9 == 21300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1161");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751928272L + "'", long3 == 1575751928272L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1162");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751928616L + "'", long3 == 1575751928616L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 16500L + "'", long7 == 16500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1300L + "'", long8 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 19500L + "'", long9 == 19500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1163");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3400L + "'", long4 == 3400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1164");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1165");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751929225L + "'", long3 == 1575751929225L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1166");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751929360L + "'", long6 == 1575751929360L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6000L + "'", long7 == 6000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1167");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1168");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3800L + "'", long4 == 3800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5700L + "'", long6 == 5700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1169");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751929977L + "'", long3 == 1575751929977L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1170");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17200L + "'", long8 == 17200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1171");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        long long3 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800L + "'", long2 == 1800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2400L + "'", long3 == 2400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1172");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751930549L + "'", long3 == 1575751930549L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1173");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751930836L + "'", long3 == 1575751930836L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1174");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5100L + "'", long6 == 5100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1175");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751931225L + "'", long6 == 1575751931225L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1176");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751931363L + "'", long3 == 1575751931363L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1177");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 16900L + "'", long8 == 16900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch2.test1178");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toString();
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
            System.out.format("%n%s%n", "StopWatch2.test1179");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.String str5 = stopWatch0.toString();
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
            System.out.format("%n%s%n", "StopWatch2.test1180");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751932120L + "'", long3 == 1575751932120L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 109000L + "'", long6 == 109000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }
}
