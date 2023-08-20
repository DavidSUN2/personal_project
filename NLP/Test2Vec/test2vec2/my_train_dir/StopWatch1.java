
package StopWatch;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StopWatch1 {

    public static boolean debug = false;

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0501");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751775815L + "'", long3 == 1575751775815L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0502");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751775985L + "'", long3 == 1575751775985L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 17300L + "'", long6 == 17300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0503");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751776053L + "'", long2 == 1575751776053L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751776053L + "'", long3 == 1575751776053L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3000L + "'", long4 == 3000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0504");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0505");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
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
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0506");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1500L + "'", long4 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0507");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751777766L + "'", long3 == 1575751777766L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3800L + "'", long4 == 3800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0508");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751777819L + "'", long3 == 1575751777819L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0509");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
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
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0510");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1400L + "'", long2 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751778027L + "'", long4 == 1575751778027L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0511");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getStartTime();
        long long8 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751778178L + "'", long6 == 1575751778178L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751778178L + "'", long7 == 1575751778178L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0512");
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
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5400L + "'", long7 == 5400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0513");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0514");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751778534L + "'", long6 == 1575751778534L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0515");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0516");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0517");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.resume();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751779254L + "'", long3 == 1575751779254L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8000L + "'", long7 == 8000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0518");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751779526L + "'", long8 == 1575751779526L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0519");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0520");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0521");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751780637L + "'", long3 == 1575751780637L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0522");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751780710L + "'", long2 == 1575751780710L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0523");
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
            long long8 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3400L + "'", long4 == 3400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0524");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
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
            System.out.format("%n%s%n", "StopWatch1.test0525");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751781113L + "'", long3 == 1575751781113L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16900L + "'", long6 == 16900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18800L + "'", long8 == 18800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1600L + "'", long9 == 1600L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0526");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751781396L + "'", long4 == 1575751781396L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2800L + "'", long9 == 2800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0527");
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
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751781548L + "'", long3 == 1575751781548L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800L + "'", long5 == 1800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6700L + "'", long7 == 6700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0528");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751781862L + "'", long4 == 1575751781862L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0529");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3400L + "'", long3 == 3400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2100L + "'", long5 == 2100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2100L + "'", long7 == 2100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2100L + "'", long8 == 2100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 22500L + "'", long9 == 22500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0530");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751782141L + "'", long3 == 1575751782141L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21800L + "'", long7 == 21800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0531");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getStartTime();
        long long8 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751783047L + "'", long6 == 1575751783047L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751783047L + "'", long7 == 1575751783047L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8600L + "'", long8 == 8600L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0532");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4800L + "'", long6 == 4800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0533");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751783298L + "'", long3 == 1575751783298L);
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
            System.out.format("%n%s%n", "StopWatch1.test0534");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751783395L + "'", long3 == 1575751783395L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0535");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5800L + "'", long4 == 5800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0536");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3200L + "'", long3 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0537");
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
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751783634L + "'", long4 == 1575751783634L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0538");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3000L + "'", long3 == 3000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1600L + "'", long4 == 1600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1600L + "'", long5 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0539");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0540");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getNanoTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 15500L + "'", long5 == 15500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751784328L + "'", long7 == 1575751784328L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0541");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0542");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751784989L + "'", long3 == 1575751784989L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700L + "'", long7 == 1700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0543");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751785258L + "'", long3 == 1575751785258L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4300L + "'", long4 == 4300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0544");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751785393L + "'", long3 == 1575751785393L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20300L + "'", long7 == 20300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 23300L + "'", long9 == 23300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0545");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751785847L + "'", long3 == 1575751785847L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8400L + "'", long7 == 8400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0546");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3000L + "'", long3 == 3000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751786214L + "'", long6 == 1575751786214L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0547");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6900L + "'", long7 == 6900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0548");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getStartTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751786765L + "'", long4 == 1575751786765L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751786765L + "'", long6 == 1575751786765L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0549");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3300L + "'", long4 == 3300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 19200L + "'", long7 == 19200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0550");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
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
            System.out.format("%n%s%n", "StopWatch1.test0551");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751787263L + "'", long4 == 1575751787263L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5300L + "'", long5 == 5300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0552");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6900L + "'", long3 == 6900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 8800L + "'", long4 == 8800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0553");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0554");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751789093L + "'", long4 == 1575751789093L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0555");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
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
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0556");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751789236L + "'", long3 == 1575751789236L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1100L + "'", long5 == 1100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0557");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3100L + "'", long4 == 3100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0558");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3400L + "'", long4 == 3400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1300L + "'", long7 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1300L + "'", long8 == 1300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0559");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.start();
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
            System.out.format("%n%s%n", "StopWatch1.test0560");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751789790L + "'", long2 == 1575751789790L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751789790L + "'", long3 == 1575751789790L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3800L + "'", long4 == 3800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0561");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0562");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751791293L + "'", long3 == 1575751791293L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 15100L + "'", long6 == 15100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1300L + "'", long8 == 1300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0563");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18500L + "'", long8 == 18500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0564");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        java.lang.String str1 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0565");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751791909L + "'", long3 == 1575751791909L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4000L + "'", long4 == 4000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
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
            System.out.format("%n%s%n", "StopWatch1.test0566");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1100L + "'", long3 == 1100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6100L + "'", long6 == 6100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0567");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 13900L + "'", long6 == 13900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0568");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751792921L + "'", long4 == 1575751792921L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0569");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4500L + "'", long6 == 4500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0570");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3100L + "'", long4 == 3100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4600L + "'", long6 == 4600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0571");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751793485L + "'", long3 == 1575751793485L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0572");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        long long7 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0573");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600L + "'", long4 == 3600L);
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
            System.out.format("%n%s%n", "StopWatch1.test0574");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
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
            System.out.format("%n%s%n", "StopWatch1.test0575");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getStartTime();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751794498L + "'", long8 == 1575751794498L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0576");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751794740L + "'", long4 == 1575751794740L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5300L + "'", long5 == 5300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 7300L + "'", long8 == 7300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0577");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1400L + "'", long4 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1400L + "'", long5 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751795105L + "'", long6 == 1575751795105L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6700L + "'", long7 == 6700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0578");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751795279L + "'", long3 == 1575751795279L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0579");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3300L + "'", long3 == 3300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4000L + "'", long4 == 4000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0580");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6700L + "'", long6 == 6700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8500L + "'", long8 == 8500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0581");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getStartTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0582");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751796030L + "'", long4 == 1575751796030L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0583");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
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
            System.out.format("%n%s%n", "StopWatch1.test0584");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5400L + "'", long4 == 5400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0585");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.resume();
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
            System.out.format("%n%s%n", "StopWatch1.test0586");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1300L + "'", long3 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3700L + "'", long4 == 3700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0587");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
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
            System.out.format("%n%s%n", "StopWatch1.test0588");
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
            long long9 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6700L + "'", long6 == 6700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0589");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6100L + "'", long6 == 6100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0590");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5700L + "'", long7 == 5700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0591");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4900L + "'", long6 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0592");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751798196L + "'", long3 == 1575751798196L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0593");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getNanoTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 15500L + "'", long5 == 15500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0594");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751798900L + "'", long3 == 1575751798900L);
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
            System.out.format("%n%s%n", "StopWatch1.test0595");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751799042L + "'", long3 == 1575751799042L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751799042L + "'", long6 == 1575751799042L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0596");
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
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751799208L + "'", long4 == 1575751799208L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0597");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0598");
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
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751799520L + "'", long3 == 1575751799520L);
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
            System.out.format("%n%s%n", "StopWatch1.test0599");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751799957L + "'", long3 == 1575751799957L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0600");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751800057L + "'", long3 == 1575751800057L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0601");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0602");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6300L + "'", long6 == 6300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9800L + "'", long9 == 9800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0603");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751801017L + "'", long3 == 1575751801017L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21700L + "'", long7 == 21700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800L + "'", long9 == 1800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0604");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751801338L + "'", long3 == 1575751801338L);
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
            System.out.format("%n%s%n", "StopWatch1.test0605");
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
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751801463L + "'", long4 == 1575751801463L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6000L + "'", long5 == 6000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0606");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751803069L + "'", long4 == 1575751803069L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0607");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0608");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16300L + "'", long6 == 16300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751803669L + "'", long7 == 1575751803669L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0609");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getStartTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1400L + "'", long3 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751803883L + "'", long4 == 1575751803883L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0610");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 17300L + "'", long6 == 17300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0611");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1400L + "'", long4 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1400L + "'", long5 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0612");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751804720L + "'", long3 == 1575751804720L);
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
            System.out.format("%n%s%n", "StopWatch1.test0613");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751804830L + "'", long3 == 1575751804830L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0614");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1300L + "'", long3 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0615");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
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
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 22600L + "'", long9 == 22600L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0616");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1200L + "'", long2 == 1200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0617");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751805265L + "'", long3 == 1575751805265L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0618");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long7 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1400L + "'", long4 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1400L + "'", long5 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751805481L + "'", long7 == 1575751805481L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0619");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751805651L + "'", long3 == 1575751805651L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 20100L + "'", long7 == 20100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1500L + "'", long8 == 1500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0620");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1500L + "'", long3 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4300L + "'", long4 == 4300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0621");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0622");
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
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3200L + "'", long3 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0623");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751807019L + "'", long3 == 1575751807019L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86800L + "'", long7 == 86800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0624");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751808379L + "'", long3 == 1575751808379L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0625");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0626");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 19200L + "'", long8 == 19200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 19200L + "'", long9 == 19200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0627");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
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
            System.out.format("%n%s%n", "StopWatch1.test0628");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18100L + "'", long8 == 18100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0629");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17800L + "'", long7 == 17800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0630");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2000L + "'", long2 == 2000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751809280L + "'", long4 == 1575751809280L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0631");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751809358L + "'", long3 == 1575751809358L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3700L + "'", long4 == 3700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
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
            System.out.format("%n%s%n", "StopWatch1.test0632");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0633");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0634");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
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
            System.out.format("%n%s%n", "StopWatch1.test0635");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0636");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 13400L + "'", long8 == 13400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751810536L + "'", long9 == 1575751810536L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0637");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751810629L + "'", long3 == 1575751810629L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0638");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.resume();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0639");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751810864L + "'", long6 == 1575751810864L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0640");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751811020L + "'", long3 == 1575751811020L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0641");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
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
            System.out.format("%n%s%n", "StopWatch1.test0642");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0643");
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
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0644");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5100L + "'", long5 == 5100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9000L + "'", long7 == 9000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0645");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751813374L + "'", long3 == 1575751813374L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0646");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.reset();
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
            System.out.format("%n%s%n", "StopWatch1.test0647");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32600L + "'", long6 == 32600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32600L + "'", long8 == 32600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0648");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6100L + "'", long6 == 6100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751813851L + "'", long9 == 1575751813851L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0649");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 16300L + "'", long7 == 16300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0650");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0651");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getStartTime();
        long long8 = stopWatch0.getNanoTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751814429L + "'", long6 == 1575751814429L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751814429L + "'", long7 == 1575751814429L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 7600L + "'", long8 == 7600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0652");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1400L + "'", long3 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4000L + "'", long4 == 4000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0653");
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
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0654");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3000L + "'", long3 == 3000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1600L + "'", long4 == 1600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1600L + "'", long5 == 1600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1600L + "'", long6 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0655");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17800L + "'", long7 == 17800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0656");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0657");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0658");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 24100L + "'", long6 == 24100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 26300L + "'", long7 == 26300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0659");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0660");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5100L + "'", long6 == 5100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8900L + "'", long8 == 8900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8900L + "'", long9 == 8900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0661");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0662");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1500L + "'", long3 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0663");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751816341L + "'", long4 == 1575751816341L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0664");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long8 = stopWatch0.getStartTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751816546L + "'", long8 == 1575751816546L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0665");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long8 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 27700L + "'", long6 == 27700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32400L + "'", long8 == 32400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0666");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1600L + "'", long2 == 1600L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0667");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1400L + "'", long3 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0668");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751817874L + "'", long4 == 1575751817874L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0669");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751817949L + "'", long4 == 1575751817949L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0670");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751818200L + "'", long3 == 1575751818200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0671");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3200L + "'", long3 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700L + "'", long4 == 1700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700L + "'", long5 == 1700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751818416L + "'", long8 == 1575751818416L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0672");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4500L + "'", long6 == 4500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4500L + "'", long8 == 4500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0673");
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
            long long9 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751819005L + "'", long4 == 1575751819005L);
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
            System.out.format("%n%s%n", "StopWatch1.test0674");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751819126L + "'", long4 == 1575751819126L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
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
            System.out.format("%n%s%n", "StopWatch1.test0675");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.stop();
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
            System.out.format("%n%s%n", "StopWatch1.test0676");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0677");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long7 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1400L + "'", long2 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4400L + "'", long7 == 4400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0678");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0679");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0680");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        long long1 = stopWatch0.getNanoTime();
        long long2 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0681");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0682");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        long long1 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0683");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1200L + "'", long2 == 1200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0684");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751821590L + "'", long3 == 1575751821590L);
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
            System.out.format("%n%s%n", "StopWatch1.test0685");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0686");
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
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3000L + "'", long3 == 3000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1600L + "'", long4 == 1600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1600L + "'", long5 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0687");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
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
            System.out.format("%n%s%n", "StopWatch1.test0688");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toSplitString();
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
            System.out.format("%n%s%n", "StopWatch1.test0689");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751822475L + "'", long3 == 1575751822475L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751822475L + "'", long6 == 1575751822475L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4200L + "'", long9 == 4200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0690");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getNanoTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1500L + "'", long3 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7100L + "'", long5 == 7100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0691");
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
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751822826L + "'", long6 == 1575751822826L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751822826L + "'", long7 == 1575751822826L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0692");
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
            long long8 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751823355L + "'", long3 == 1575751823355L);
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
            System.out.format("%n%s%n", "StopWatch1.test0693");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751823438L + "'", long3 == 1575751823438L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10800L + "'", long6 == 10800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0694");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751823576L + "'", long3 == 1575751823576L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 7400L + "'", long5 == 7400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0695");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 19900L + "'", long6 == 19900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0696");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getStartTime();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751823939L + "'", long4 == 1575751823939L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751823939L + "'", long5 == 1575751823939L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751823939L + "'", long7 == 1575751823939L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0697");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0698");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21000L + "'", long7 == 21000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751824616L + "'", long9 == 1575751824616L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0699");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5500L + "'", long6 == 5500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0700");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0701");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0702");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751827000L + "'", long3 == 1575751827000L);
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
            System.out.format("%n%s%n", "StopWatch1.test0703");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700L + "'", long5 == 1700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0704");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751827647L + "'", long3 == 1575751827647L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4200L + "'", long4 == 4200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0705");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
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
            System.out.format("%n%s%n", "StopWatch1.test0706");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2300L + "'", long3 == 2300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5200L + "'", long4 == 5200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0707");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1300L + "'", long2 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0708");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 14400L + "'", long7 == 14400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0709");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0710");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5800L + "'", long6 == 5800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751830197L + "'", long8 == 1575751830197L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0711");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5800L + "'", long7 == 5800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 18100L + "'", long9 == 18100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0712");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0713");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751830761L + "'", long3 == 1575751830761L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0714");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751831144L + "'", long3 == 1575751831144L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1400L + "'", long7 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751831144L + "'", long8 == 1575751831144L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0715");
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0716");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18400L + "'", long8 == 18400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11400L + "'", long9 == 11400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0717");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7100L + "'", long7 == 7100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751831755L + "'", long8 == 1575751831755L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0718");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
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
            System.out.format("%n%s%n", "StopWatch1.test0719");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0720");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1200L + "'", long4 == 1200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1200L + "'", long5 == 1200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0721");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        java.lang.String str2 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.000" + "'", str2.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0722");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        stopWatch0.stop();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1400L + "'", long4 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1400L + "'", long5 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0723");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1500L + "'", long4 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1500L + "'", long6 == 1500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0724");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18900L + "'", long7 == 18900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0725");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 23300L + "'", long7 == 23300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751833887L + "'", long8 == 1575751833887L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0726");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751834122L + "'", long4 == 1575751834122L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0727");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7900L + "'", long7 == 7900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0728");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751834693L + "'", long6 == 1575751834693L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0729");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751834807L + "'", long3 == 1575751834807L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0730");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0731");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 11800L + "'", long8 == 11800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21400L + "'", long9 == 21400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0732");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751835566L + "'", long6 == 1575751835566L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 22900L + "'", long7 == 22900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0733");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0734");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751836038L + "'", long4 == 1575751836038L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0735");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5200L + "'", long6 == 5200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0736");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751836546L + "'", long3 == 1575751836546L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17900L + "'", long7 == 17900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1400L + "'", long8 == 1400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0737");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751836643L + "'", long3 == 1575751836643L);
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
            System.out.format("%n%s%n", "StopWatch1.test0738");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0739");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5200L + "'", long6 == 5200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5200L + "'", long7 == 5200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0740");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.unsplit();
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
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0741");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751837294L + "'", long3 == 1575751837294L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0742");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        long long5 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0743");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751837685L + "'", long8 == 1575751837685L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0744");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0745");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10300L + "'", long9 == 10300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0746");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751838111L + "'", long2 == 1575751838111L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751838111L + "'", long3 == 1575751838111L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0747");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751838194L + "'", long3 == 1575751838194L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0748");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751839268L + "'", long7 == 1575751839268L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0749");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751839461L + "'", long3 == 1575751839461L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5600L + "'", long4 == 5600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0750");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751839588L + "'", long3 == 1575751839588L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 17600L + "'", long6 == 17600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751839588L + "'", long8 == 1575751839588L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0751");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751839706L + "'", long8 == 1575751839706L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0752");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751839803L + "'", long3 == 1575751839803L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6200L + "'", long5 == 6200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6200L + "'", long6 == 6200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0753");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0754");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751840127L + "'", long3 == 1575751840127L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 18500L + "'", long9 == 18500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0755");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5700L + "'", long6 == 5700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0756");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751840502L + "'", long3 == 1575751840502L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1400L + "'", long7 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17800L + "'", long8 == 17800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0757");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0758");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 20100L + "'", long9 == 20100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0759");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751840794L + "'", long3 == 1575751840794L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0760");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751841447L + "'", long3 == 1575751841447L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0761");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751841616L + "'", long3 == 1575751841616L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 16100L + "'", long6 == 16100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18200L + "'", long8 == 18200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0762");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751841741L + "'", long6 == 1575751841741L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0763");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getNanoTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751842041L + "'", long4 == 1575751842041L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4900L + "'", long5 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6800L + "'", long8 == 6800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0764");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0765");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5500L + "'", long5 == 5500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0766");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751842452L + "'", long3 == 1575751842452L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 18800L + "'", long7 == 18800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0767");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long7 = stopWatch0.getSplitNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1600L + "'", long7 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0768");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751842800L + "'", long3 == 1575751842800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3800L + "'", long4 == 3800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751842800L + "'", long6 == 1575751842800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0769");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751843035L + "'", long4 == 1575751843035L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0770");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751843291L + "'", long4 == 1575751843291L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6500L + "'", long5 == 6500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0771");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751843405L + "'", long6 == 1575751843405L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751843405L + "'", long7 == 1575751843405L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0772");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
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
            System.out.format("%n%s%n", "StopWatch1.test0773");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        java.lang.String str8 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751843827L + "'", long3 == 1575751843827L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0774");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1400L + "'", long4 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1400L + "'", long6 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751844086L + "'", long8 == 1575751844086L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0775");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751844288L + "'", long4 == 1575751844288L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5700L + "'", long5 == 5700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0776");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4800L + "'", long6 == 4800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4800L + "'", long8 == 4800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 19800L + "'", long9 == 19800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0777");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751844731L + "'", long3 == 1575751844731L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17000L + "'", long7 == 17000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0778");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7000L + "'", long7 == 7000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5900L + "'", long8 == 5900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0779");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751845029L + "'", long3 == 1575751845029L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0780");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.suspend();
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
            System.out.format("%n%s%n", "StopWatch1.test0781");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1300L + "'", long3 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751845454L + "'", long4 == 1575751845454L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0782");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 41000L + "'", long8 == 41000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 42900L + "'", long9 == 42900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0783");
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
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751845814L + "'", long3 == 1575751845814L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0784");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751845921L + "'", long3 == 1575751845921L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0785");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5900L + "'", long6 == 5900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6500L + "'", long7 == 6500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751846094L + "'", long9 == 1575751846094L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0786");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751846238L + "'", long3 == 1575751846238L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4700L + "'", long4 == 4700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1400L + "'", long5 == 1400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0787");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3100L + "'", long3 == 3100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1400L + "'", long4 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0788");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0789");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4500L + "'", long6 == 4500L);
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
            System.out.format("%n%s%n", "StopWatch1.test0790");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
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
            System.out.format("%n%s%n", "StopWatch1.test0791");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751848153L + "'", long3 == 1575751848153L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0792");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0793");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751849430L + "'", long3 == 1575751849430L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0794");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getStartTime();
        java.lang.String str6 = stopWatch0.toString();
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751849557L + "'", long5 == 1575751849557L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0795");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0796");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5600L + "'", long6 == 5600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0797");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751849888L + "'", long4 == 1575751849888L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8200L + "'", long7 == 8200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0798");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4500L + "'", long6 == 4500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 19800L + "'", long8 == 19800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0799");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1100L + "'", long3 == 1100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751850114L + "'", long4 == 1575751850114L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0800");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0801");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800L + "'", long5 == 1800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800L + "'", long6 == 1800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0802");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.String str8 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 16200L + "'", long7 == 16200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0803");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751850651L + "'", long3 == 1575751850651L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
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
            System.out.format("%n%s%n", "StopWatch1.test0804");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751850754L + "'", long3 == 1575751850754L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0805");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        stopWatch0.start();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 431100L + "'", long4 == 431100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0806");
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
            System.out.format("%n%s%n", "StopWatch1.test0807");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        long long8 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3200L + "'", long3 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800L + "'", long4 == 1800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800L + "'", long5 == 1800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800L + "'", long6 == 1800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0808");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751851316L + "'", long3 == 1575751851316L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 18300L + "'", long6 == 18300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0809");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass4 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1600L + "'", long2 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0810");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4700L + "'", long6 == 4700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0811");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0812");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751852036L + "'", long3 == 1575751852036L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0813");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0814");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751852608L + "'", long4 == 1575751852608L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5700L + "'", long5 == 5700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0815");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0816");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751852823L + "'", long4 == 1575751852823L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5500L + "'", long5 == 5500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751852823L + "'", long7 == 1575751852823L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0817");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3300L + "'", long3 == 3300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2100L + "'", long4 == 2100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2100L + "'", long5 == 2100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751852969L + "'", long6 == 1575751852969L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0818");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3100L + "'", long3 == 3100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3800L + "'", long4 == 3800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1500L + "'", long7 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1500L + "'", long8 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0819");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
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
            System.out.format("%n%s%n", "StopWatch1.test0820");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3700L + "'", long4 == 3700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1500L + "'", long7 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0821");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5300L + "'", long6 == 5300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0822");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3400L + "'", long4 == 3400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751854423L + "'", long6 == 1575751854423L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0823");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0824");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5900L + "'", long6 == 5900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0825");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long8 = stopWatch0.getStartTime();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751854907L + "'", long3 == 1575751854907L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751854907L + "'", long8 == 1575751854907L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0826");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1900L + "'", long2 == 1900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800L + "'", long7 == 1800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0827");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getStartTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been started");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3000L + "'", long3 == 3000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3700L + "'", long4 == 3700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751855157L + "'", long6 == 1575751855157L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0828");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getNanoTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751855354L + "'", long6 == 1575751855354L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6200L + "'", long7 == 6200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0829");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7000L + "'", long6 == 7000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0830");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751855727L + "'", long4 == 1575751855727L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0831");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4900L + "'", long6 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0832");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0833");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6400L + "'", long6 == 6400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7000L + "'", long7 == 7000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0834");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751856673L + "'", long4 == 1575751856673L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6600L + "'", long5 == 6600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0835");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751856850L + "'", long3 == 1575751856850L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4300L + "'", long4 == 4300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0836");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6900L + "'", long3 == 6900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 7800L + "'", long4 == 7800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0837");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
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
            System.out.format("%n%s%n", "StopWatch1.test0838");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getStartTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17900L + "'", long7 == 17900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751857314L + "'", long8 == 1575751857314L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0839");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4900L + "'", long7 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0840");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800L + "'", long2 == 1800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 16100L + "'", long4 == 16100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0841");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        java.lang.String str5 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1575751857834L + "'", long2 == 1575751857834L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751857834L + "'", long3 == 1575751857834L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0842");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        long long1 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0843");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1500L + "'", long3 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751859045L + "'", long4 == 1575751859045L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0844");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2400L + "'", long3 == 2400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1100L + "'", long4 == 1100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1100L + "'", long5 == 1100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0845");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0846");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0847");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long7 = stopWatch0.getSplitNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1600L + "'", long2 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 900L + "'", long7 == 900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 20400L + "'", long9 == 20400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0848");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
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
            System.out.format("%n%s%n", "StopWatch1.test0849");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0850");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751860472L + "'", long4 == 1575751860472L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0851");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751860543L + "'", long5 == 1575751860543L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0852");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
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
            System.out.format("%n%s%n", "StopWatch1.test0853");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751860831L + "'", long3 == 1575751860831L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 17600L + "'", long6 == 17600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 19300L + "'", long8 == 19300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 21200L + "'", long9 == 21200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0854");
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0855");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getStartTime();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751861585L + "'", long8 == 1575751861585L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0856");
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
            long long8 = stopWatch0.getSplitNanoTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0857");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751861780L + "'", long3 == 1575751861780L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4300L + "'", long6 == 4300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0858");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751861930L + "'", long3 == 1575751861930L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4200L + "'", long4 == 4200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 19800L + "'", long8 == 19800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0859");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751862251L + "'", long3 == 1575751862251L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0860");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getStartTime();
        java.lang.String str6 = stopWatch0.toString();
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751862423L + "'", long5 == 1575751862423L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0861");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751862542L + "'", long3 == 1575751862542L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0862");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0863");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6500L + "'", long8 == 6500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5100L + "'", long9 == 5100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0864");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6000L + "'", long7 == 6000L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0865");
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
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4600L + "'", long6 == 4600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0866");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
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
            System.out.format("%n%s%n", "StopWatch1.test0867");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751863385L + "'", long4 == 1575751863385L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0868");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3300L + "'", long4 == 3300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0869");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7000L + "'", long6 == 7000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0870");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751864315L + "'", long4 == 1575751864315L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0871");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751864518L + "'", long3 == 1575751864518L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17600L + "'", long7 == 17600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1500L + "'", long8 == 1500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0872");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5300L + "'", long8 == 5300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0873");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751864863L + "'", long4 == 1575751864863L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5700L + "'", long5 == 5700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6900L + "'", long7 == 6900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0874");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 14700L + "'", long8 == 14700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0875");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0876");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0877");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 18900L + "'", long8 == 18900L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0878");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getStartTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5100L + "'", long6 == 5100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751866345L + "'", long8 == 1575751866345L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 7200L + "'", long9 == 7200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0879");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6000L + "'", long7 == 6000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9200L + "'", long9 == 9200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0880");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751866807L + "'", long6 == 1575751866807L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751866807L + "'", long7 == 1575751866807L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0881");
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
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751866993L + "'", long3 == 1575751866993L);
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
            System.out.format("%n%s%n", "StopWatch1.test0882");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751867296L + "'", long3 == 1575751867296L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 19100L + "'", long8 == 19100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1400L + "'", long9 == 1400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0883");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751867798L + "'", long3 == 1575751867798L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1400L + "'", long8 == 1400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0884");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
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
            System.out.format("%n%s%n", "StopWatch1.test0885");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751868160L + "'", long4 == 1575751868160L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0886");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        java.lang.String str3 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0887");
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
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751868628L + "'", long3 == 1575751868628L);
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
            System.out.format("%n%s%n", "StopWatch1.test0888");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitNanoTime();
        long long8 = stopWatch0.getSplitNanoTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600L + "'", long4 == 3600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1500L + "'", long7 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1500L + "'", long8 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751868978L + "'", long9 == 1575751868978L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0889");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6200L + "'", long6 == 6200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0890");
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
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751869663L + "'", long3 == 1575751869663L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4000L + "'", long4 == 4000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0891");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2400L + "'", long3 == 2400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1300L + "'", long5 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1300L + "'", long6 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0892");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0893");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getNanoTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17800L + "'", long8 == 17800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751870370L + "'", long9 == 1575751870370L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0894");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751870711L + "'", long6 == 1575751870711L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0895");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1600L + "'", long4 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0896");
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
            long long9 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751871210L + "'", long3 == 1575751871210L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0897");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751871400L + "'", long3 == 1575751871400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0898");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1400L + "'", long2 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751871517L + "'", long6 == 1575751871517L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0899");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751871638L + "'", long3 == 1575751871638L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
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
            System.out.format("%n%s%n", "StopWatch1.test0900");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751871857L + "'", long3 == 1575751871857L);
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
            System.out.format("%n%s%n", "StopWatch1.test0901");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751872099L + "'", long9 == 1575751872099L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0902");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751872381L + "'", long4 == 1575751872381L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0903");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0904");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600L + "'", long4 == 3600L);
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
            System.out.format("%n%s%n", "StopWatch1.test0905");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751873207L + "'", long3 == 1575751873207L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751873207L + "'", long8 == 1575751873207L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0906");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3000L + "'", long3 == 3000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1500L + "'", long4 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751873671L + "'", long9 == 1575751873671L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0907");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751873756L + "'", long3 == 1575751873756L);
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
            System.out.format("%n%s%n", "StopWatch1.test0908");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0909");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0910");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751874248L + "'", long6 == 1575751874248L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0911");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1400L + "'", long3 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4500L + "'", long4 == 4500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0912");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 2700L + "'", long5 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2700L + "'", long6 == 2700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0913");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751874853L + "'", long3 == 1575751874853L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0914");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0915");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0916");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751875447L + "'", long3 == 1575751875447L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17700L + "'", long7 == 17700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 18800L + "'", long9 == 18800L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0917");
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
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751875702L + "'", long8 == 1575751875702L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0918");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17400L + "'", long7 == 17400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0919");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751876111L + "'", long4 == 1575751876111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5600L + "'", long7 == 5600L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0920");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0921");
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
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751876378L + "'", long3 == 1575751876378L);
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
            System.out.format("%n%s%n", "StopWatch1.test0922");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0923");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long9 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1575751876731L + "'", long9 == 1575751876731L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0924");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
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
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0925");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitTime();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17000L + "'", long7 == 17000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0926");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751877372L + "'", long4 == 1575751877372L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0927");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751877497L + "'", long3 == 1575751877497L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 11000L + "'", long4 == 11000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0928");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0929");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        long long5 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0930");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1200L + "'", long5 == 1200L);
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
            System.out.format("%n%s%n", "StopWatch1.test0931");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getStartTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751878132L + "'", long6 == 1575751878132L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751878132L + "'", long7 == 1575751878132L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3200L + "'", long9 == 3200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0932");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0933");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getStartTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1300L + "'", long4 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751878437L + "'", long5 == 1575751878437L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0934");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751878634L + "'", long3 == 1575751878634L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4300L + "'", long4 == 4300L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0935");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600L + "'", long4 == 3600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751878789L + "'", long6 == 1575751878789L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0936");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751879235L + "'", long3 == 1575751879235L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 18000L + "'", long6 == 18000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0937");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751879725L + "'", long3 == 1575751879725L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4700L + "'", long4 == 4700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751879725L + "'", long6 == 1575751879725L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0938");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1400L + "'", long2 == 1400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0939");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751879948L + "'", long6 == 1575751879948L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0940");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
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
            System.out.format("%n%s%n", "StopWatch1.test0941");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3400L + "'", long4 == 3400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0942");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0943");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1500L + "'", long4 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751880743L + "'", long6 == 1575751880743L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0944");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0945");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 21500L + "'", long7 == 21500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0946");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751881279L + "'", long4 == 1575751881279L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5800L + "'", long5 == 5800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1400L + "'", long6 == 1400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0947");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        stopWatch0.resume();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0948");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass4 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0949");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1400L + "'", long3 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4100L + "'", long4 == 4100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0950");
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
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0951");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3400L + "'", long3 == 3400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1600L + "'", long4 == 1600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1600L + "'", long5 == 1600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1600L + "'", long6 == 1600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7700L + "'", long7 == 7700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0952");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751882743L + "'", long4 == 1575751882743L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0953");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0954");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        stopWatch0.suspend();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0955");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751883280L + "'", long4 == 1575751883280L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0956");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751883462L + "'", long6 == 1575751883462L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0957");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751883665L + "'", long4 == 1575751883665L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0958");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751883814L + "'", long4 == 1575751883814L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0959");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
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
            System.out.format("%n%s%n", "StopWatch1.test0960");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1300L + "'", long3 == 1300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 4100L + "'", long5 == 4100L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4100L + "'", long6 == 4100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0961");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751885175L + "'", long3 == 1575751885175L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0962");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2600L + "'", long3 == 2600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3300L + "'", long4 == 3300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751885340L + "'", long6 == 1575751885340L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0963");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6300L + "'", long6 == 6300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0964");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getNanoTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5800L + "'", long6 == 5800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 7600L + "'", long8 == 7600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0965");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3300L + "'", long4 == 3300L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751885883L + "'", long5 == 1575751885883L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0966");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751886002L + "'", long4 == 1575751886002L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751886002L + "'", long6 == 1575751886002L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7700L + "'", long7 == 7700L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0967");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751886121L + "'", long3 == 1575751886121L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 19600L + "'", long6 == 19600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0968");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        long long9 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3200L + "'", long3 == 3200L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3900L + "'", long4 == 3900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5800L + "'", long6 == 5800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1300L + "'", long7 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0969");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getStartTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751887465L + "'", long3 == 1575751887465L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4200L + "'", long4 == 4200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751887465L + "'", long8 == 1575751887465L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0970");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getStartTime();
        stopWatch0.reset();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751887615L + "'", long5 == 1575751887615L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0971");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0972");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751887992L + "'", long3 == 1575751887992L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
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
            System.out.format("%n%s%n", "StopWatch1.test0973");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
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
            System.out.format("%n%s%n", "StopWatch1.test0974");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5100L + "'", long5 == 5100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0975");
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
            long long8 = stopWatch0.getSplitTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0976");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0977");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0978");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        java.lang.String str7 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0979");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5600L + "'", long7 == 5600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0980");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getStartTime();
        java.lang.String str6 = stopWatch0.toString();
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751889687L + "'", long5 == 1575751889687L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0981");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751889840L + "'", long3 == 1575751889840L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3700L + "'", long4 == 3700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751889840L + "'", long6 == 1575751889840L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0982");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 24100L + "'", long8 == 24100L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0983");
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
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6600L + "'", long6 == 6600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8200L + "'", long8 == 8200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0984");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751890466L + "'", long3 == 1575751890466L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0985");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        long long7 = stopWatch0.getTime();
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
            System.out.format("%n%s%n", "StopWatch1.test0986");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0987");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getSplitNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 20200L + "'", long9 == 20200L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0988");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1400L + "'", long3 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4400L + "'", long4 == 4400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0989");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751892614L + "'", long3 == 1575751892614L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
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
            System.out.format("%n%s%n", "StopWatch1.test0990");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getSplitTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8200L + "'", long7 == 8200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0991");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751893114L + "'", long3 == 1575751893114L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4500L + "'", long4 == 4500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1500L + "'", long5 == 1500L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0992");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3300L + "'", long4 == 3300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5100L + "'", long6 == 5100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0993");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6500L + "'", long6 == 6500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0994");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
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
            System.out.format("%n%s%n", "StopWatch1.test0995");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5900L + "'", long5 == 5900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0996");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1300L + "'", long2 == 1300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0997");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2900L + "'", long3 == 2900L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1600L + "'", long4 == 1600L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1600L + "'", long5 == 1600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 17400L + "'", long8 == 17400L);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0998");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        long long3 = stopWatch0.getNanoTime();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2000L + "'", long2 == 2000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2500L + "'", long3 == 2500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test0999");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751895412L + "'", long4 == 1575751895412L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StopWatch() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.test1000");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitNanoTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1400L + "'", long4 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1400L + "'", long5 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1400L + "'", long8 == 1400L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0:00:00.000" + "'", str9.equals("0:00:00.000"));
    }
}
