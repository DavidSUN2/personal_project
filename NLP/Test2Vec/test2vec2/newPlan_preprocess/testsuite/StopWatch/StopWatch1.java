package StopWatch;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StopWatch1 {

    public static boolean debug = false;

    @Test
    public void StopWatch0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0501");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0502");
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
    public void StopWatch0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0503");
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
    public void StopWatch0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0504");
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
    public void StopWatch0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0505");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
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
    }

    @Test
    public void StopWatch0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0506");
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
    public void StopWatch0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0507");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751777766L + "'", long3 == 1575751777766L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3800L + "'", long4 == 3800L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0508");
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
    public void StopWatch0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0509");
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
    public void StopWatch0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0510");
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
    public void StopWatch0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0511");
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
    public void StopWatch0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0512");
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
    public void StopWatch0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0513");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0514");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0515");
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
    public void StopWatch0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0516");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0517");
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
    public void StopWatch0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0518");
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
    public void StopWatch0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0519");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0520");
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
    public void StopWatch0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0521");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0522");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getStartTime();
        long long3 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0523");
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
    public void StopWatch0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0524");
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
    public void StopWatch0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0525");
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
    public void StopWatch0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0526");
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
    public void StopWatch0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0527");
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
    public void StopWatch0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0528");
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
    public void StopWatch0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0529");
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
    public void StopWatch0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0530");
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
    public void StopWatch0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0531");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getStartTime();
        long long8 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751783047L + "'", long6 == 1575751783047L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751783047L + "'", long7 == 1575751783047L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 8600L + "'", long8 == 8600L);
    }

    @Test
    public void StopWatch0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0532");
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
    public void StopWatch0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0533");
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
    public void StopWatch0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0534");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0535");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0536");
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
    public void StopWatch0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0537");
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
    public void StopWatch0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0538");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0539");
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
    public void StopWatch0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0540");
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
    public void StopWatch0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0541");
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
    public void StopWatch0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0542");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0543");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0544");
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
    public void StopWatch0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0545");
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
    public void StopWatch0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0546");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0547");
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
    public void StopWatch0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0548");
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
    public void StopWatch0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0549");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3300L + "'", long4 == 3300L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 19200L + "'", long7 == 19200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0550");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0551");
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
    public void StopWatch0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0552");
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
    public void StopWatch0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0553");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0554");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751789093L + "'", long4 == 1575751789093L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0555");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
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
    }

    @Test
    public void StopWatch0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0556");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751789236L + "'", long3 == 1575751789236L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1100L + "'", long5 == 1100L);
    }

    @Test
    public void StopWatch0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0557");
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
    public void StopWatch0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0558");
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
    public void StopWatch0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0559");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        stopWatch0.start();
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
    public void StopWatch0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0560");
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
    public void StopWatch0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0561");
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
    public void StopWatch0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0562");
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
    public void StopWatch0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0563");
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
    public void StopWatch0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0564");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        java.lang.String str1 = stopWatch0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0:00:00.000" + "'", str1.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0565");
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
    public void StopWatch0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0566");
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
    public void StopWatch0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0567");
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
    public void StopWatch0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0568");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751792921L + "'", long4 == 1575751792921L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0569");
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
    public void StopWatch0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0570");
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
    public void StopWatch0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0571");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0572");
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
    public void StopWatch0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0573");
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
    public void StopWatch0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0574");
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
    public void StopWatch0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0575");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getStartTime();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751794498L + "'", long8 == 1575751794498L);
    }

    @Test
    public void StopWatch0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0576");
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
    public void StopWatch0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0577");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
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
    public void StopWatch0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0578");
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
    public void StopWatch0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0579");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0580");
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
    public void StopWatch0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0581");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0582");
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
    public void StopWatch0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0583");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0584");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0585");
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
    public void StopWatch0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0586");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0587");
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
    public void StopWatch0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0588");
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
    public void StopWatch0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0589");
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
    public void StopWatch0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0590");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5700L + "'", long7 == 5700L);
    }

    @Test
    public void StopWatch0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0591");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4900L + "'", long6 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0592");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0593");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getNanoTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 15500L + "'", long5 == 15500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0594");
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
    public void StopWatch0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0595");
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
    public void StopWatch0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0596");
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
    public void StopWatch0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0597");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0598");
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
    public void StopWatch0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0599");
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
    public void StopWatch0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0600");
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
    public void StopWatch0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0601");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0602");
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
    public void StopWatch0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0603");
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
    public void StopWatch0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0604");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0605");
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
    public void StopWatch0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0606");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
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
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751803069L + "'", long4 == 1575751803069L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void StopWatch0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0607");
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
    public void StopWatch0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0608");
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
    public void StopWatch0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0609");
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
    public void StopWatch0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0610");
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
    public void StopWatch0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0611");
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
    public void StopWatch0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0612");
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
    public void StopWatch0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0613");
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
    public void StopWatch0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0614");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0615");
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
    public void StopWatch0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0616");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0617");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0618");
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
    public void StopWatch0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0619");
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
    public void StopWatch0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0620");
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
    public void StopWatch0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0621");
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
    public void StopWatch0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0622");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0623");
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
    public void StopWatch0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0624");
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
    public void StopWatch0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0625");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0626");
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
    public void StopWatch0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0627");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
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
    public void StopWatch0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0628");
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
    public void StopWatch0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0629");
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
    public void StopWatch0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0630");
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
    public void StopWatch0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0631");
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
    public void StopWatch0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0632");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0633");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0634");
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
    public void StopWatch0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0635");
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
    public void StopWatch0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0636");
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
    public void StopWatch0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0637");
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
    public void StopWatch0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0638");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.resume();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0639");
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
    public void StopWatch0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0640");
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
    public void StopWatch0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0641");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
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
    public void StopWatch0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0642");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0643");
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
    public void StopWatch0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0644");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0645");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0646");
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
    public void StopWatch0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0647");
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
    public void StopWatch0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0648");
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
    public void StopWatch0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0649");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getNanoTime();
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
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 16300L + "'", long7 == 16300L);
    }

    @Test
    public void StopWatch0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0650");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0651");
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
    public void StopWatch0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0652");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0653");
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
    public void StopWatch0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0654");
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
    public void StopWatch0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0655");
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
    public void StopWatch0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0656");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0657");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0658");
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
    public void StopWatch0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0659");
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
    public void StopWatch0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0660");
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
    public void StopWatch0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0661");
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
    public void StopWatch0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0662");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0663");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.reset();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751816341L + "'", long4 == 1575751816341L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0664");
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
    public void StopWatch0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0665");
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
    public void StopWatch0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0666");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1600L + "'", long2 == 1600L);
    }

    @Test
    public void StopWatch0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0667");
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
    public void StopWatch0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0668");
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
    public void StopWatch0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0669");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0670");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751818200L + "'", long3 == 1575751818200L);
    }

    @Test
    public void StopWatch0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0671");
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
    public void StopWatch0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0672");
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
    public void StopWatch0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0673");
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
    public void StopWatch0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0674");
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
    public void StopWatch0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0675");
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
    public void StopWatch0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0676");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void StopWatch0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0677");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long7 = stopWatch0.getSplitNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0678");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0679");
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
    public void StopWatch0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0680");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        long long1 = stopWatch0.getNanoTime();
        long long2 = stopWatch0.getNanoTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void StopWatch0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0681");
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
    public void StopWatch0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0682");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        long long1 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0683");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0684");
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
    public void StopWatch0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0685");
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
    public void StopWatch0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0686");
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
    public void StopWatch0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0687");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0688");
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
    public void StopWatch0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0689");
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
    public void StopWatch0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0690");
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
    public void StopWatch0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0691");
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
    public void StopWatch0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0692");
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
    public void StopWatch0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0693");
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
    public void StopWatch0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0694");
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
    public void StopWatch0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0695");
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
    public void StopWatch0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0696");
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
    public void StopWatch0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0697");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0698");
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
    public void StopWatch0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0699");
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
    public void StopWatch0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0700");
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
    public void StopWatch0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0701");
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
    public void StopWatch0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0702");
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
    public void StopWatch0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0703");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0704");
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
    public void StopWatch0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0705");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
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
    public void StopWatch0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0706");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0707");
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
    public void StopWatch0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0708");
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
    public void StopWatch0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0709");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0710");
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
    public void StopWatch0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0711");
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
    public void StopWatch0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0712");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0713");
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
    public void StopWatch0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0714");
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
    public void StopWatch0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0715");
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
    public void StopWatch0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0716");
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
    public void StopWatch0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0717");
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
    public void StopWatch0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0718");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0719");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0720");
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
    public void StopWatch0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0721");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        java.lang.String str2 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0722");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0723");
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
    public void StopWatch0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0724");
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
    public void StopWatch0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0725");
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
    public void StopWatch0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0726");
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
    public void StopWatch0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0727");
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
    public void StopWatch0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0728");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751834693L + "'", long6 == 1575751834693L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0729");
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
    public void StopWatch0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0730");
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
    public void StopWatch0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0731");
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
    public void StopWatch0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0732");
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
    public void StopWatch0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0733");
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
    public void StopWatch0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0734");
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
    public void StopWatch0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0735");
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
    public void StopWatch0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0736");
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
    public void StopWatch0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0737");
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
    public void StopWatch0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0738");
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
    public void StopWatch0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0739");
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
    public void StopWatch0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0740");
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
    public void StopWatch0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0741");
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
    public void StopWatch0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0742");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        long long5 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0743");
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
    public void StopWatch0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0744");
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
    public void StopWatch0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0745");
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
    public void StopWatch0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0746");
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
    public void StopWatch0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0747");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0748");
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
    public void StopWatch0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0749");
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
    public void StopWatch0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0750");
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
    public void StopWatch0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0751");
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
    public void StopWatch0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0752");
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
    public void StopWatch0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0753");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0754");
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
    public void StopWatch0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0755");
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
    public void StopWatch0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0756");
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
    public void StopWatch0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0757");
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
    public void StopWatch0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0758");
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
    public void StopWatch0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0759");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.split();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0760");
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
    public void StopWatch0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0761");
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
    public void StopWatch0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0762");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751841741L + "'", long6 == 1575751841741L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0763");
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
    public void StopWatch0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0764");
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
    public void StopWatch0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0765");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0766");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
        stopWatch0.split();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0767");
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
    public void StopWatch0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0768");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getStartTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0769");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751843035L + "'", long4 == 1575751843035L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0770");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751843291L + "'", long4 == 1575751843291L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6500L + "'", long5 == 6500L);
    }

    @Test
    public void StopWatch0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0771");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2800L + "'", long3 == 2800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751843405L + "'", long6 == 1575751843405L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1575751843405L + "'", long7 == 1575751843405L);
    }

    @Test
    public void StopWatch0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0772");
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
    public void StopWatch0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0773");
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
    public void StopWatch0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0774");
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
    public void StopWatch0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0775");
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
    public void StopWatch0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0776");
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
    public void StopWatch0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0777");
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
    public void StopWatch0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0778");
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
    public void StopWatch0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0779");
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
    public void StopWatch0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0780");
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
    public void StopWatch0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0781");
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
    public void StopWatch0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0782");
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
    public void StopWatch0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0783");
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
    public void StopWatch0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0784");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0785");
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
    public void StopWatch0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0786");
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
    public void StopWatch0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0787");
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
    public void StopWatch0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0788");
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
    public void StopWatch0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0789");
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
    public void StopWatch0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0790");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
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
    public void StopWatch0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0791");
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
    public void StopWatch0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0792");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0793");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long3 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0794");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getStartTime();
        java.lang.String str6 = stopWatch0.toString();
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751849557L + "'", long5 == 1575751849557L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0795");
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
    public void StopWatch0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0796");
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
    public void StopWatch0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0797");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751849888L + "'", long4 == 1575751849888L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8200L + "'", long7 == 8200L);
    }

    @Test
    public void StopWatch0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0798");
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
    public void StopWatch0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0799");
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
    public void StopWatch0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0800");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0801");
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
    public void StopWatch0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0802");
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
    public void StopWatch0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0803");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0804");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0805");
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
    public void StopWatch0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0806");
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
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0807");
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
    public void StopWatch0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0808");
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
    public void StopWatch0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0809");
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
    public void StopWatch0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0810");
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
    public void StopWatch0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0811");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0812");
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
    public void StopWatch0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0813");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void StopWatch0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0814");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751852608L + "'", long4 == 1575751852608L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5700L + "'", long5 == 5700L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0815");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
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
    public void StopWatch0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0816");
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
    public void StopWatch0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0817");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0818");
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
    public void StopWatch0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0819");
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
    public void StopWatch0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0820");
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
    public void StopWatch0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0821");
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
    public void StopWatch0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0822");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0823");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
        try {
            long long3 = stopWatch0.getSplitNanoTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0824");
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
    public void StopWatch0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0825");
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
    public void StopWatch0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0826");
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
    public void StopWatch0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0827");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0828");
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
    public void StopWatch0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0829");
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
    public void StopWatch0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0830");
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
    public void StopWatch0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0831");
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
    public void StopWatch0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0832");
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
    public void StopWatch0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0833");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 6400L + "'", long6 == 6400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 7000L + "'", long7 == 7000L);
    }

    @Test
    public void StopWatch0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0834");
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
    public void StopWatch0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0835");
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
    public void StopWatch0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0836");
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
    public void StopWatch0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0837");
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
    public void StopWatch0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0838");
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
    public void StopWatch0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0839");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4900L + "'", long7 == 4900L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0840");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0841");
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
    public void StopWatch0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0842");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        long long1 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0843");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1500L + "'", long3 == 1500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751859045L + "'", long4 == 1575751859045L);
    }

    @Test
    public void StopWatch0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0844");
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
    public void StopWatch0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0845");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3200L + "'", long4 == 3200L);
    }

    @Test
    public void StopWatch0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0846");
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
    public void StopWatch0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0847");
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
    public void StopWatch0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0848");
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
    public void StopWatch0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0849");
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
    public void StopWatch0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0850");
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
    public void StopWatch0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0851");
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
    public void StopWatch0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0852");
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
    public void StopWatch0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0853");
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
    public void StopWatch0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0854");
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
    public void StopWatch0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0855");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getStartTime();
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751861585L + "'", long8 == 1575751861585L);
    }

    @Test
    public void StopWatch0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0856");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0857");
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
    public void StopWatch0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0858");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getNanoTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0859");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0860");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getStartTime();
        java.lang.String str6 = stopWatch0.toString();
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751862423L + "'", long5 == 1575751862423L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0861");
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
    public void StopWatch0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0862");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0863");
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
    public void StopWatch0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0864");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 6000L + "'", long7 == 6000L);
    }

    @Test
    public void StopWatch0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0865");
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
    public void StopWatch0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0866");
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
    public void StopWatch0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0867");
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
    public void StopWatch0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0868");
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
    public void StopWatch0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0869");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 7000L + "'", long6 == 7000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0870");
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
    public void StopWatch0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0871");
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
    public void StopWatch0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0872");
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
    public void StopWatch0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0873");
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
    public void StopWatch0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0874");
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
    public void StopWatch0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0875");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.stop();
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0:00:00.000" + "'", str7.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0876");
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
    public void StopWatch0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0877");
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
    public void StopWatch0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0878");
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
    public void StopWatch0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0879");
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
    public void StopWatch0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0880");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getStartTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0881");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0882");
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
    public void StopWatch0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0883");
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
    public void StopWatch0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0884");
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
    public void StopWatch0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0885");
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
    public void StopWatch0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0886");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        java.lang.String str3 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0887");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getSplitTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        java.lang.String str6 = stopWatch0.toString();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1575751868628L + "'", long3 == 1575751868628L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0:00:00.000" + "'", str5.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0888");
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
    public void StopWatch0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0889");
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
    public void StopWatch0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0890");
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
    public void StopWatch0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0891");
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
    public void StopWatch0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0892");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0893");
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
    public void StopWatch0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0894");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.suspend();
        long long6 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2700L + "'", long3 == 2700L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3500L + "'", long4 == 3500L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751870711L + "'", long6 == 1575751870711L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0895");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0896");
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
    public void StopWatch0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0897");
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
    public void StopWatch0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0898");
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
    public void StopWatch0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0899");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
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
    public void StopWatch0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0900");
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
    public void StopWatch0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0901");
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
    public void StopWatch0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0902");
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
    public void StopWatch0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0903");
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
    public void StopWatch0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0904");
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
    public void StopWatch0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0905");
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
    public void StopWatch0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0906");
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
    public void StopWatch0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0907");
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
    public void StopWatch0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0908");
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
    public void StopWatch0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0909");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0910");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751874248L + "'", long6 == 1575751874248L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0911");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getSplitNanoTime();
        long long4 = stopWatch0.getNanoTime();
        stopWatch0.split();
        stopWatch0.split();
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1400L + "'", long3 == 1400L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4500L + "'", long4 == 4500L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0912");
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
    public void StopWatch0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0913");
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
    public void StopWatch0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0914");
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
    public void StopWatch0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0915");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void StopWatch0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0916");
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
    public void StopWatch0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0917");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getNanoTime();
        stopWatch0.split();
        long long8 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1575751875702L + "'", long8 == 1575751875702L);
    }

    @Test
    public void StopWatch0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0918");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0:00:00.000" + "'", str4.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 17400L + "'", long7 == 17400L);
    }

    @Test
    public void StopWatch0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0919");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751876111L + "'", long4 == 1575751876111L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5600L + "'", long7 == 5600L);
    }

    @Test
    public void StopWatch0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0920");
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
    public void StopWatch0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0921");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        stopWatch0.stop();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0922");
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
    public void StopWatch0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0923");
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
    public void StopWatch0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0924");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toSplitString();
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
    }

    @Test
    public void StopWatch0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0925");
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
    public void StopWatch0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0926");
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
    public void StopWatch0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0927");
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
    public void StopWatch0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0928");
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
    public void StopWatch0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0929");
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
    public void StopWatch0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0930");
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
    public void StopWatch0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0931");
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
    public void StopWatch0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0932");
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
    public void StopWatch0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0933");
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
    public void StopWatch0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0934");
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
    public void StopWatch0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0935");
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
    public void StopWatch0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0936");
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
    public void StopWatch0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0937");
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
    public void StopWatch0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0938");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0939");
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
    public void StopWatch0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0940");
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
    public void StopWatch0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0941");
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
    public void StopWatch0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0942");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0943");
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
    public void StopWatch0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0944");
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
    public void StopWatch0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0945");
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
    public void StopWatch0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0946");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getSplitNanoTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751881279L + "'", long4 == 1575751881279L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5800L + "'", long5 == 5800L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1400L + "'", long6 == 1400L);
    }

    @Test
    public void StopWatch0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0947");
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
    public void StopWatch0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0948");
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
    public void StopWatch0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0949");
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
    public void StopWatch0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0950");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getNanoTime();
        long long4 = stopWatch0.getNanoTime();
        java.lang.String str5 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0951");
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
    public void StopWatch0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0952");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0953");
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
    public void StopWatch0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0954");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        long long3 = stopWatch0.getTime();
        stopWatch0.suspend();
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
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0955");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getStartTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1575751883280L + "'", long4 == 1575751883280L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void StopWatch0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0956");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long6 = stopWatch0.getStartTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1575751883462L + "'", long6 == 1575751883462L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void StopWatch0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0957");
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
    public void StopWatch0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0958");
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
    public void StopWatch0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0959");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
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
    public void StopWatch0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0960");
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
    public void StopWatch0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0961");
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
    public void StopWatch0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0962");
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
    public void StopWatch0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0963");
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
    public void StopWatch0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0964");
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
    public void StopWatch0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0965");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getStartTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0966");
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
    public void StopWatch0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0967");
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
    public void StopWatch0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0968");
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
    public void StopWatch0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0969");
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
    public void StopWatch0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0970");
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
    public void StopWatch0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0971");
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
    public void StopWatch0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0972");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0973");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        // The following exception was thrown during execution in StopWatch generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void StopWatch0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0974");
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
    public void StopWatch0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0975");
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
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void StopWatch0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0976");
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
    public void StopWatch0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0977");
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
    public void StopWatch0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0978");
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
    public void StopWatch0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0979");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitNanoTime();
        java.lang.String str8 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5600L + "'", long7 == 5600L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0:00:00.000" + "'", str8.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0980");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getStartTime();
        java.lang.String str6 = stopWatch0.toString();
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1575751889687L + "'", long5 == 1575751889687L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0:00:00.000" + "'", str6.equals("0:00:00.000"));
    }

    @Test
    public void StopWatch0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0981");
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
    public void StopWatch0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0982");
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
    public void StopWatch0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0983");
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
    public void StopWatch0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0984");
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
    public void StopWatch0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0985");
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
    public void StopWatch0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0986");
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
    public void StopWatch0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0987");
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
    public void StopWatch0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0988");
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
    public void StopWatch0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0989");
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
    public void StopWatch0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0990");
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
    public void StopWatch0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0991");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long3 = stopWatch0.getStartTime();
        long long4 = stopWatch0.getNanoTime();
        long long5 = stopWatch0.getSplitNanoTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0992");
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
    public void StopWatch0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0993");
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
    public void StopWatch0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0994");
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
    public void StopWatch0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0995");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getNanoTime();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0996");
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
    public void StopWatch0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0997");
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
    public void StopWatch0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0998");
        org.apache.commons.lang3.time.StopWatch stopWatch0 = new org.apache.commons.lang3.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getNanoTime();
        long long3 = stopWatch0.getNanoTime();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in StopWatch generation
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
    public void StopWatch0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch0999");
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
    public void StopWatch1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StopWatch1.StopWatch1000");
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
