
package DurationFormatUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DurationFormatUtils1 {

    public static boolean debug = false;

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0501");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.998S" + "'", str2.equals("P-1Y11M30DT23H59M59.998S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0502");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0311");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0311" + "'", str2.equals("P0Y000DT00000.0311"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0503");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.902S" + "'", str2.equals("P-1Y11M30DT23H59M59.902S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0504");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0505");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.99-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.99-1" + "'", str2.equals("P0Y000DT00000.99-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0506");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0507");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.0510", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0508");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (-1L), "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0509");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 100L, "P0000Y000DT00000.0510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0510");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0511");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0000Y000DT00000.010-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0512");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) '#', "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0513");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0000Y000DT00000.010-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010-1" + "'", str2.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0514");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 1, "P0Y000DT00000.03210", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0515");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.051S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05110" + "'", str3.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0516");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 10, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0517");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) ' ', false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0518");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0519");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 1L, "P0000Y0M0DT0H0M0.001S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str3.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0520");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str2.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0521");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) 10, "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0522");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y000DT00000.991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.991" + "'", str3.equals("P0Y000DT00000.991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0523");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) 0, "0:00:00.010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0524");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.0011", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0011" + "'", str3.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0525");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.01035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0526");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P0Y000DT00000.10135", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0527");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11030DT23059059.968100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0528");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '#', "P00-1Y11030DT23059059.99910", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0529");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11M30DT23H59M59.913S" + "'", str3.equals("P00-1Y11M30DT23H59M59.913S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0530");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "0:00:00.010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.010" + "'", str2.equals("0:00:00.010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0531");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(10L, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0532");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) 10, "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0533");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0000Y0-10DT07430-10.0103599965");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0103599965" + "'", str2.equals("P0000Y0-10DT07430-10.0103599965"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0534");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P0Y0M0DT0H0M0.99S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0535");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0536");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.952S" + "'", str2.equals("P-1Y11M30DT23H59M59.952S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0537");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0000Y000DT00000.10035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.10035" + "'", str2.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0538");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0000Y000DT00000.10035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0539");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0540");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01099" + "'", str2.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0541");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0542");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.101S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.1010" + "'", str2.equals("P0Y000DT00000.1010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0543");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.051-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0544");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 100L, "P0Y0M0DT0H0M0.090S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0545");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0546");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.097100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0547");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.902S" + "'", str2.equals("P-1Y11M30DT23H59M59.902S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0548");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 0L, "P-1Y11M30DT23H59M59.975S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0549");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str2.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0550");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 1L, "P0Y0-10DT07430-10.0513599999", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0551");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 0, "0 days", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0552");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 0, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0553");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.051S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.05110" + "'", str2.equals("P0Y000DT00000.05110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0554");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 1, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0555");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "0 30a059 0 hour 0 1439inute59 0 econ3059", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0556");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0557");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.01052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0558");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11M30DT23H59M59.990S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99097" + "'", str3.equals("P-1Y11030DT23059059.99097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0559");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11M30DT23H59M59.989S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.98910" + "'", str3.equals("P-1Y11030DT23059059.98910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0560");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "0:00:00.035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0561");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 100, "P0Y000DT00000.01010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0562");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y0M0DT0H0M0.052S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.052-1" + "'", str2.equals("P0Y000DT00000.052-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0563");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0564");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 100, "P0Y0M0DT0H0M0.096S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0565");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 100, "P-1Y11M30DT23H59M59.952S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0566");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P-1Y11M30DT23H59M59.975S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9751" + "'", str2.equals("P-1Y11030DT23059059.9751"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0567");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01052" + "'", str2.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0568");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 0, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0569");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11M30DT23H59M59.999S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str3.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0570");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (-1), true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0571");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.053S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.05332" + "'", str2.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0572");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.96610", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0573");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(0L, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0574");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 100, "0 30a086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0575");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0576");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 0, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0577");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 0, "0 30a059 0 hour 0 1439inute59 0 econ3059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0578");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0579");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0580");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0581");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) '4', "P0Y000DT00000.052-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0582");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2.equals("P0Y0M0DT0H0M0.031S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0583");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.032S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.032-1" + "'", str2.equals("P0Y000DT00000.032-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0584");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 0, "P0Y000DT00000.0010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0585");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.900S" + "'", str2.equals("P-1Y11M30DT23H59M59.900S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0586");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0100" + "'", str2.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0587");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0588");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P00-1Y11-130DT2374359-159.9043599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0589");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "0:00:00.035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0590");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) 0, "0:00:00.032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.032" + "'", str3.equals("0:00:00.032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0591");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.032-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.032-1" + "'", str3.equals("P0Y000DT00000.032-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0592");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11M30DT23H59M59.952S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.952-1" + "'", str3.equals("P-1Y11030DT23059059.952-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0593");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 0, "P0Y000DT00000.00110", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0594");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 100L, "P0Y000DT00000.0100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0595");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 10, false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0596");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.00010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0597");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0598");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.10010" + "'", str2.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0599");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 10, "P0Y0M0DT0H0M0.051S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0600");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 1, "P-1Y11030DT23059059.952-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.952-1" + "'", str3.equals("P-1Y11030DT23059059.952-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0601");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "hi!", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0602");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11-130DT2374359-159.9893599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9893599913" + "'", str2.equals("P-1Y11-130DT2374359-159.9893599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0603");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (-1L), "P00-1Y11M30DT23H59M59.904S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0604");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) -1, "P-1Y11030DT23059059.9900", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0605");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0039", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0039" + "'", str3.equals("P0Y000DT00000.0039"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0606");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.900S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9000" + "'", str2.equals("P-1Y11030DT23059059.9000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0607");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.1010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.1010" + "'", str3.equals("P0Y000DT00000.1010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0608");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', 1L, "P0Y000DT00000.051-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0609");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 1, "P0Y000DT00000.03310");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03310" + "'", str3.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0610");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01099" + "'", str2.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0611");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 0, "0:00:00.000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0612");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) '4', "P00-1Y11M30DT23H59M59.904S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.90417" + "'", str3.equals("P00-1Y11030DT23059059.90417"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0613");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0614");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.09690");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09690" + "'", str2.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0615");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.032S" + "'", str2.equals("P0Y0M0DT0H0M0.032S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0616");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P0000Y000DT00000.10035", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0617");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0618");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.91090", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0619");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 100, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0620");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0621");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 0L, "P0Y000DT00000.051-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0622");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 100, "P-1Y11-130DT2374359-159.9663599900", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0623");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 0, "P-1Y11030DT23059059.9581", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0624");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0625");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "0:00:00.052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0626");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.097" + "'", str2.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0627");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 100, "P0000Y000DT00000.010-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0628");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P-1Y11030DT23059059.968100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0629");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) '#', "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0630");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) -1, "P0Y000DT00000.01010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0631");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 10, "0 30a086399", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0632");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11M30DT23H59M59.952S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str2.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0633");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11030DT23059059.99910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str2.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0634");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P00-1Y11030DT23059059.99910", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.99910" + "'", str3.equals("P00-1Y11030DT23059059.99910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0635");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.0011");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0011" + "'", str2.equals("P0Y000DT00000.0011"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0636");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11M30DT23H59M59.899S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.8991" + "'", str2.equals("P-1Y11030DT23059059.8991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0637");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P-1Y11030DT23059059.9100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9100" + "'", str3.equals("P-1Y11030DT23059059.9100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0638");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0639");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '#', true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0640");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P00-1Y11M30DT23H59M59.999S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0641");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (-1L), "0 30a086399", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0642");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 10L, "P0Y0M0DT0H0M0.033S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0643");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', 1L, "0:00:00.000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0644");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P-1Y11030DT23059059.9990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9990" + "'", str3.equals("P-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0645");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.097100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0646");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2.equals("P0Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0647");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) ' ', "P0Y0M0DT0H0M0.031S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03133" + "'", str3.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0648");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.958S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0649");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(1L, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0650");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.9900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9900" + "'", str2.equals("P-1Y11030DT23059059.9900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0651");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0652");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '#', "P-1Y11030DT23059059.9000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9000" + "'", str3.equals("P-1Y11030DT23059059.9000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0653");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0654");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (-1L), "P0000Y000DT00000.01032", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0655");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) -1, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str3.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0656");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0657");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.03352", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0658");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 0, "P-1Y11M30DT23H59M59.998S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9983599903" + "'", str3.equals("P-1Y11-130DT2374359-159.9983599903"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0659");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0-10DT07430-10.0013599947", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str3.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0660");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 10, "P0Y000DT00000.0011", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0661");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (-1), "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01032" + "'", str3.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0662");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0663");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 100, "P-1Y11M30DT23H59M59.968S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0664");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.051S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.051-1" + "'", str3.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0665");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03211" + "'", str2.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0666");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "0:00:00.000", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.000" + "'", str3.equals("0:00:00.000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0667");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str2.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0668");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0669");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (short) 100, "P0Y0M0DT0H0M0.053S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0670");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.0030", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0671");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0672");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11030DT23059059.9990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9990" + "'", str3.equals("P-1Y11030DT23059059.9990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0673");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 1, "P-1Y11M30DT23H59M59.958S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0674");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0675");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 100, "P00-1Y11M30DT23H59M59.904S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0676");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.001" + "'", str2.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0677");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P00-1Y11030DT23059059.99910", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0678");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.10010" + "'", str2.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0679");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 100, "P0Y0M0DT0H0M0.099S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0680");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.035" + "'", str2.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0681");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11030DT23059059.9661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str2.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0682");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11030DT23059059.9100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9100" + "'", str3.equals("P-1Y11030DT23059059.9100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0683");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0350", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0684");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0-10DT07430-10.0323599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str2.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0685");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) -1, "P-1Y11030DT23059059.9661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0686");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P-1Y11030DT23059059.99097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.99097" + "'", str2.equals("P-1Y11030DT23059059.99097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0687");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) 1, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0688");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "0:00:00.99", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.99" + "'", str3.equals("0:00:00.99"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0689");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.101-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.101-1" + "'", str3.equals("P0Y000DT00000.101-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0690");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 0, "P-1Y11M30DT23H59M59.900S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0691");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01032" + "'", str2.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0692");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0693");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "P-1Y11030DT23059059.96610", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0694");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0695");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P0000Y000DT00000.10035", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0696");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0697");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), 0L, "P0Y000DT00000.00111", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0698");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (-1), "P0Y000DT00000.991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0699");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 0, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0700");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) -1, "P-1Y11030DT23059059.9100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0701");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "0:00:00.001");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0:00:00.001" + "'", str2.equals("0:00:00.001"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0702");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '4', "P0Y000DT00000.001100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0703");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P-1Y11M30DT23H59M59.901S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str2.equals("P-1Y11030DT23059059.90132"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0704");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 100, "P-1Y11030DT23059059.952-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0705");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P00-1Y11030DT23059059.999100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str2.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0706");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) (byte) 1, "0:00:00.100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0707");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (short) -1, "P0Y000DT00000.03352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0708");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0709");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010100" + "'", str2.equals("P0000Y000DT00000.010100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0710");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 0, "P-1Y11M30DT23H59M59.998S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0711");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0712");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.033-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.033-1" + "'", str2.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0713");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) 1, "P0Y0M0DT0H0M0.000S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0714");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.033S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.033-1" + "'", str3.equals("P0Y000DT00000.033-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0715");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 0, "0:00:00.097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.097" + "'", str3.equals("0:00:00.097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0716");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 10, "P0000Y000DT00000.0510", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0717");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P00-1Y11M30DT23H59M59.999S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.999-1" + "'", str2.equals("P00-1Y11030DT23059059.999-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0718");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, 1L, "P0Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0719");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str2.equals("0 0a000 0 hour 0 0inute00 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0720");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) 'a', "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0721");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 10, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str3.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0722");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, 0L, "P0Y000DT00000.9910");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.9910" + "'", str3.equals("P0Y000DT00000.9910"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0723");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.051-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.051-1" + "'", str2.equals("P0Y000DT00000.051-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0724");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.01052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0725");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 100, "P0Y0-10DT07430-10.0013599947", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0726");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P-1Y11030DT23059059.968100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0727");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.09690", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0728");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.90132", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str3.equals("P-1Y11030DT23059059.90132"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0729");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.010100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010100" + "'", str2.equals("P0000Y000DT00000.010100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0730");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "0 0econ00");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0econ00" + "'", str2.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0731");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 1, "P0Y000DT00000.10135", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0732");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) '#', "P0000Y000DT00000.010-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.010-1" + "'", str3.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0733");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (-1), true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0734");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "0 days");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0 0a00" + "'", str2.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0735");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str2.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0736");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0737");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 0, "P0Y000DT00000.0330", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0738");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 0, "P0Y0M0DT0H0M0.010S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0739");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0000Y000DT00000.010-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010-1" + "'", str2.equals("P0000Y000DT00000.010-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0740");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.000S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00097" + "'", str2.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0741");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(10L, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0742");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y0M0DT0H0M0.096S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09635" + "'", str3.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0743");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (short) 1, "P0Y0M0DT0H0M0.052S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0744");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P00-1Y11030DT23059059.999-1", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999-1" + "'", str3.equals("P00-1Y11030DT23059059.999-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0745");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.01032" + "'", str2.equals("P0Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0746");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.90352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90352" + "'", str2.equals("P-1Y11030DT23059059.90352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0747");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.913S" + "'", str2.equals("P-1Y11M30DT23H59M59.913S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0748");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "0:00:00.100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0749");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0750");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.96610", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0751");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (byte) -1, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0752");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y000DT00000.0510", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0753");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "0:00:00.100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.100" + "'", str3.equals("0:00:00.100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0754");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str2.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0755");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P-1Y11030DT23059059.99010", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0756");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.01035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0757");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.910S" + "'", str2.equals("P-1Y11M30DT23H59M59.910S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0758");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (short) 0, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str3.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0759");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0760");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11-130DT2374359-159.9983599903");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9983599903" + "'", str2.equals("P-1Y11-130DT2374359-159.9983599903"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0761");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 100L, "P0Y000DT00000.01010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0762");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 0L, "0 seconds", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0763");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords(100L, false, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3.equals("0 days 0 hours 0 minutes 0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0764");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0030");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0030" + "'", str2.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0765");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 0, "P0Y000DT00000.00010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3.equals("P0Y000DT00000.00010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0766");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) -1, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0767");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y0M0DT0H0M0.031S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.031-1" + "'", str3.equals("P0Y000DT00000.031-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0768");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.009S" + "'", str2.equals("P0Y0M0DT0H0M0.009S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0769");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0000Y0M0DT0H0M0.010S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.010100" + "'", str2.equals("P0000Y000DT00000.010100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0770");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 0, "P-1Y11M30DT23H59M59.975S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9750" + "'", str3.equals("P-1Y11030DT23059059.9750"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0771");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str2.equals("P0Y0M0DT0H0M0.097S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0772");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 1, "0 30a059 0 hour 0 1439inute59 0 econ3059", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0773");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11M30DT23H59M59.901S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str2.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0774");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0775");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 0, true, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0776");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11030DT23059059.91090");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.91090" + "'", str2.equals("P-1Y11030DT23059059.91090"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0777");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (byte) 10, "P0Y000DT00000.05332", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0778");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, 0L, "P-1Y11M30DT23H59M59.966S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0779");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0780");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0781");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) ' ', "P00-1Y11M30DT23H59M59.904S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0782");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) ' ', "P0Y000DT00000.0310", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0783");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.01035", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0784");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0785");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0786");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) '#', false, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 days" + "'", str3.equals("0 days"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0787");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P-1Y11030DT23059059.9661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0788");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.001100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.001100" + "'", str2.equals("P0Y000DT00000.001100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0789");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P0000Y0-10DT07430-10.0103599965", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0790");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11M30DT23H59M59.903S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9030" + "'", str2.equals("P-1Y11030DT23059059.9030"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0791");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), 10L, "P0000Y000DT00000.0510", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0792");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (short) 100, "P-1Y11030DT23059059.90132", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0793");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.09690", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09690" + "'", str3.equals("P0Y000DT00000.09690"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0794");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11M30DT23H59M59.989S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str3.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0795");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P00-1Y11-130DT2374359-159.9043599990", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11-130DT2374359-159.9043599990" + "'", str3.equals("P00-1Y11-130DT2374359-159.9043599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0796");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.001S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00152" + "'", str3.equals("P0Y000DT00000.00152"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0797");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P-1Y11030DT23059059.9681", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str3.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0798");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str2.equals("P0Y0M0DT0H0M0.065S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0799");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 10, "0:00:00.032", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0800");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0801");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 0L, "0:00:00.035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.035" + "'", str3.equals("0:00:00.035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0802");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) (-1), "0:00:00.001", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0803");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (-1), "P-1Y11-130DT2374359-159.9983599903");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11-130DT2374359-159.9983599903" + "'", str2.equals("P-1Y11-130DT2374359-159.9983599903"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0804");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.042S" + "'", str2.equals("P0Y0M0DT0H0M0.042S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0805");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2.equals("P0Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0806");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "0 days", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a00" + "'", str3.equals("0 0a00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0807");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) '#', (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.964S" + "'", str2.equals("P-1Y11M30DT23H59M59.964S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0808");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str2.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0809");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 10, "P-1Y11M30DT23H59M59.968S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9689" + "'", str3.equals("P-1Y11030DT23059059.9689"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0810");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 0, "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0811");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, 1L, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0812");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0813");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.932S" + "'", str2.equals("P-1Y11M30DT23H59M59.932S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0814");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P-1Y11M30DT23H59M59.964S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.964100" + "'", str3.equals("P-1Y11030DT23059059.964100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0815");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.00097");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00097" + "'", str2.equals("P0Y000DT00000.00097"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0816");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 10L, "P0Y0M0DT0H0M0.033S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0817");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 10, "P0Y000DT00000.0010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0818");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (-1L), "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a059 0 hour 0 1439inute59 0 econ3059" + "'", str3.equals("0 30a059 0 hour 0 1439inute59 0 econ3059"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0819");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.090S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09010" + "'", str2.equals("P0Y000DT00000.09010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0820");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 100, "P-1Y11030DT23059059.952100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str3.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0821");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0030", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3.equals("P0Y000DT00000.0030"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0822");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.901-1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.901-1" + "'", str2.equals("P-1Y11030DT23059059.901-1"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0823");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "P0Y0-10DT07430-10.0333599899");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0333599899" + "'", str3.equals("P0Y0-10DT07430-10.0333599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0824");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0825");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 1, (long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0826");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0827");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0828");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 10, "0 days 0 hours 0 minutes 0 seconds");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3.equals("0 0a000 0 hour 0 0inute00 0 econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0829");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) '#', "P0000Y000DT00000.01032");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01032" + "'", str3.equals("P0000Y000DT00000.01032"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0830");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (-1), "0 86399econ3086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 86399econ3086399" + "'", str3.equals("0 86399econ3086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0831");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0000Y0-10DT07430-10.0103599913");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0103599913" + "'", str2.equals("P0000Y0-10DT07430-10.0103599913"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0832");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.010S" + "'", str2.equals("P0000Y0M0DT0H0M0.010S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0833");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0-10DT07430-10.1003599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0834");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 10, "P-1Y11030DT23059059.9581");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9581" + "'", str3.equals("P-1Y11030DT23059059.9581"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0835");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0836");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) -1, "0:00:00.052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0837");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) '#', "P-1Y11030DT23059059.9750");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9750" + "'", str3.equals("P-1Y11030DT23059059.9750"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0838");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P00-1Y11030DT23059059.9993");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.9993" + "'", str2.equals("P00-1Y11030DT23059059.9993"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0839");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0031" + "'", str2.equals("P0Y000DT00000.0031"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0840");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.098S" + "'", str2.equals("P0Y0M0DT0H0M0.098S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0841");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) 10, "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0842");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 0, "P-1Y11M30DT23H59M59.989S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0843");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.904S" + "'", str2.equals("P-1Y11M30DT23H59M59.904S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0844");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P-1Y11M30DT23H59M59.913S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str2.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0845");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.003S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00310" + "'", str2.equals("P0Y000DT00000.00310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0846");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(10L, "P-1Y11M30DT23H59M59.990S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0847");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.9661", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0848");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '4', "P0Y000DT00000.0350", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0849");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (short) 0, "P0000Y000DT00000.0100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0850");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 100, "0:00:00.99", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0851");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.096S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.096100" + "'", str2.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0852");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.035S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0350" + "'", str2.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0853");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0854");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((-1L), 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2.equals("P0Y0M0DT0H0M0.002S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0855");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) '#', "P0Y000DT00000.031-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0856");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) -1, "P0Y0-10DT07430-10.0323599990", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0857");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0858");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.09632", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09632" + "'", str3.equals("P0Y000DT00000.09632"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0859");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(1L, (long) (byte) 10, "P0Y0M0DT0H0M0.065S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0659" + "'", str3.equals("P0Y000DT00000.0659"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0860");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.099S" + "'", str2.equals("P0Y0M0DT0H0M0.099S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0861");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 100, 1L, "P-1Y11030DT23059059.96610");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.96610" + "'", str3.equals("P-1Y11030DT23059059.96610"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0862");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0863");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0000Y000DT00000.0510", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0510" + "'", str3.equals("P0000Y000DT00000.0510"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0864");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 0, "P-1Y11M30DT23H59M59.932S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0865");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11030DT23059059.90132");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.90132" + "'", str2.equals("P-1Y11030DT23059059.90132"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0866");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, 100L, "P0Y000DT00000.001100", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0867");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0868");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0000Y0M0DT0H0M0.010S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01052" + "'", str3.equals("P0000Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0869");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (-1L), "P-1Y11-130DT2374359-159.9663599900");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9663599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9663599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0870");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) (short) 0, "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0871");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2.equals("P0Y0M0DT0H0M0.101S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0872");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (-1), "P0Y0-10DT07430-10.1003599990");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.1003599990" + "'", str3.equals("P0Y0-10DT07430-10.1003599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0873");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0874");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.93252" + "'", str2.equals("P-1Y11030DT23059059.93252"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0875");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) '#', "P-1Y11M30DT23H59M59.989S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0876");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) '4', "P0000Y000DT00000.01052");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.01052" + "'", str3.equals("P0000Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0877");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(1L, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2.equals("P0Y0M0DT0H0M0.034S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0878");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 1L, "P00-1Y11M30DT23H59M59.904S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.9042" + "'", str3.equals("P00-1Y11030DT23059059.9042"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0879");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.03310");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03310" + "'", str2.equals("P0Y000DT00000.03310"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0880");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.991S" + "'", str2.equals("P-1Y11M30DT23H59M59.991S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0881");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) '4', "P0Y000DT00000.00111");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.00111" + "'", str3.equals("P0Y000DT00000.00111"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0882");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 1, "P0Y000DT00000.03352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0883");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.0100" + "'", str2.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0884");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P00-1Y11030DT23059059.99999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P00-1Y11030DT23059059.99999" + "'", str2.equals("P00-1Y11030DT23059059.99999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0885");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 0L, "P0Y000DT00000.0350");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0350" + "'", str3.equals("P0Y000DT00000.0350"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0886");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P0Y000DT00000.03133", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0887");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 1L, "P0Y0M0DT0H0M0.034S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0888");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.0000");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0000" + "'", str2.equals("P0Y000DT00000.0000"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0889");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0000Y000DT00000.10035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0890");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P-1Y11030DT23059059.968100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str2.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0891");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 1, "P0Y000DT00000.991", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0892");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', 0L, "P0Y000DT00000.09635", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0893");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 10, "P0Y000DT00000.097100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.097100" + "'", str3.equals("P0Y000DT00000.097100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0894");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, (long) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0895");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.03352");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03352" + "'", str2.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0896");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "0 0a00", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0897");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.05332");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.05332" + "'", str2.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0898");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 10, "P-1Y11030DT23059059.9681");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str3.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0899");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "0:00:00.052", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0:00:00.052" + "'", str3.equals("0:00:00.052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0900");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) -1, "P0Y0M0DT0H0M0.033S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0901");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 10, (long) '#', "0 30a086399");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 30a086399" + "'", str3.equals("0 30a086399"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0902");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P-1Y11M30DT23H59M59.901S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9010" + "'", str3.equals("P-1Y11030DT23059059.9010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0903");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, 0L, "P0Y000DT00000.101-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0904");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.952100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.952100" + "'", str2.equals("P-1Y11030DT23059059.952100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0905");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.989S" + "'", str2.equals("P-1Y11M30DT23H59M59.989S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0906");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0907");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 10, (long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.087S" + "'", str2.equals("P0Y0M0DT0H0M0.087S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0908");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0-10DT07430-10.0003599899", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0003599899" + "'", str3.equals("P0Y0-10DT07430-10.0003599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0909");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0000Y000DT00000.01099");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01099" + "'", str2.equals("P0000Y000DT00000.01099"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0910");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) (byte) 100, "P0Y000DT00000.05110", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0911");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, 0L, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0912");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.01052", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01052" + "'", str3.equals("P0Y000DT00000.01052"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0913");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.002S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0020" + "'", str3.equals("P0Y000DT00000.0020"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0914");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 0, "P0Y000DT00000.096100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.096100" + "'", str3.equals("P0Y000DT00000.096100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0915");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 100, "P0Y000DT00000.03133", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0916");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0917");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (-1), "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0100" + "'", str3.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0918");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) 0, "P-1Y11030DT23059059.9750", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0919");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P-1Y11030DT23059059.9681");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9681" + "'", str2.equals("P-1Y11030DT23059059.9681"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0920");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 100, "P0000Y000DT00000.0100");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.0100" + "'", str3.equals("P0000Y000DT00000.0100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0921");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) (short) 1, "P0Y0M0DT0H0M0.000S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0922");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) ' ', "P-1Y11030DT23059059.9661");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9661" + "'", str3.equals("P-1Y11030DT23059059.9661"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0923");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11-130DT2374359-159.9323599900", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599900" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599900"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0924");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) 0, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0925");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) '4', "P0Y000DT00000.10010", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0926");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P00-1Y11030DT23059059.999100", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P00-1Y11030DT23059059.999100" + "'", str3.equals("P00-1Y11030DT23059059.999100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0927");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (-1L), "P-1Y11M30DT23H59M59.932S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11-130DT2374359-159.9323599899" + "'", str3.equals("P-1Y11-130DT2374359-159.9323599899"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0928");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 10L, "P0Y000DT00000.05332");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05332" + "'", str3.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0929");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P0000Y0M0DT0H0M0.051S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.051100" + "'", str3.equals("P0000Y000DT00000.051100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0930");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 1, (long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.031S" + "'", str2.equals("P0Y0M0DT0H0M0.031S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0931");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) 0, "P-1Y11030DT23059059.9131");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9131" + "'", str3.equals("P-1Y11030DT23059059.9131"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0932");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.09632", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09632" + "'", str3.equals("P0Y000DT00000.09632"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0933");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (-1L), "P0Y000DT00000.097100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0934");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 10, "P0Y000DT00000.032-1", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0935");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) -1, "P-1Y11-130DT2374359-159.9893599913", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0936");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, 1L, "P-1Y11030DT23059059.9681", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0937");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 1, "P0Y000DT00000.00310", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0938");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0013599947");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0013599947" + "'", str2.equals("P0Y0-10DT07430-10.0013599947"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0939");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0000Y0-10DT07430-10.0013599969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0-10DT07430-10.0013599969" + "'", str2.equals("P0000Y0-10DT07430-10.0013599969"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0940");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.0511");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.0511" + "'", str2.equals("P0Y000DT00000.0511"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0941");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P-1Y11030DT23059059.9890");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11030DT23059059.9890" + "'", str2.equals("P-1Y11030DT23059059.9890"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0942");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDurationWords((long) (short) 100, true, true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 seconds" + "'", str3.equals("0 seconds"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0943");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 1, "P-1Y11M30DT23H59M59.991S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9911" + "'", str3.equals("P-1Y11030DT23059059.9911"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0944");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.00110");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00110" + "'", str2.equals("P0Y000DT00000.00110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0945");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.10010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3.equals("P0Y000DT00000.10010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0946");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.053S", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.05332" + "'", str3.equals("P0Y000DT00000.05332"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0947");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.09635");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.09635" + "'", str2.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0948");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(10L, (long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.025S" + "'", str2.equals("P0Y0M0DT0H0M0.025S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0949");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y0M0DT0H0M0.002S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.00210" + "'", str2.equals("P0Y000DT00000.00210"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0950");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.999S" + "'", str2.equals("P-1Y11M30DT23H59M59.999S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0951");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.042S");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.042100" + "'", str2.equals("P0Y000DT00000.042100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0952");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y0M0DT0H0M0.101S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.10110" + "'", str3.equals("P0Y000DT00000.10110"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0953");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 100, "P0000Y000DT00000.10035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0000Y000DT00000.10035" + "'", str3.equals("P0000Y000DT00000.10035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0954");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 10, "P-1Y11030DT23059059.9100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0955");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y0M0DT0H0M0.100S" + "'", str2.equals("P0000Y0M0DT0H0M0.100S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0956");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(0L, 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2.equals("P0Y0M0DT0H0M0.001S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0957");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0958");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.042S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.0420" + "'", str3.equals("P0Y000DT00000.0420"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0959");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) '4', "P0Y0M0DT0H0M0.000S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0960");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.03352", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03352" + "'", str3.equals("P0Y000DT00000.03352"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0961");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2.equals("P0Y0M0DT0H0M0.011S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0962");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str2.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0963");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (short) 1, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0964");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 1, "P0Y0-10DT07430-10.0103599991");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0103599991" + "'", str3.equals("P0Y0-10DT07430-10.0103599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0965");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.01035", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0966");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.901S" + "'", str2.equals("P-1Y11M30DT23H59M59.901S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0967");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 0L, "P-1Y11M30DT23H59M59.968S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0968");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 10, "P-1Y11030DT23059059.99010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.99010" + "'", str3.equals("P-1Y11030DT23059059.99010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0969");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(100L, (long) 10, "", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0970");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(0L, "P0Y0-10DT07430-10.0513599999");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0-10DT07430-10.0513599999" + "'", str2.equals("P0Y0-10DT07430-10.0513599999"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0971");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '#', 0L, "P-1Y11030DT23059059.9000", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0972");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration(100L, "P-1Y11030DT23059059.968100", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.968100" + "'", str3.equals("P-1Y11030DT23059059.968100"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0973");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P-1Y11030DT23059059.9751", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9751" + "'", str3.equals("P-1Y11030DT23059059.9751"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0974");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 0, (-1L), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0975");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (byte) 10, "P-1Y11030DT23059059.9911", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0976");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) '#', "P-1Y11M30DT23H59M59.999S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0977");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 'a', "P0000Y000DT00000.01010", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0978");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) '4', "P0Y000DT00000.03211");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0979");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0-10DT07430-10.0323599990", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0323599990" + "'", str3.equals("P0Y0-10DT07430-10.0323599990"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0980");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), (long) 100, "P0Y000DT00000.09635");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.09635" + "'", str3.equals("P0Y000DT00000.09635"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0981");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 10, (long) '#', "P-1Y11030DT23059059.9901", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0982");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, 1L, "P-1Y11-130DT2374359-159.9323599900", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0983");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0-10DT07430-10.0033599991", true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y0-10DT07430-10.0033599991" + "'", str3.equals("P0Y0-10DT07430-10.0033599991"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0984");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) 100, "P00-1Y11030DT23059059.999100", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0985");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) 1, (long) (byte) -1, "P00-1Y11030DT23059059.999-1", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0986");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.03133");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y000DT00000.03133" + "'", str2.equals("P0Y000DT00000.03133"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0987");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((-1L), 0L, "P-1Y11M30DT23H59M59.968S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0988");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) '4', (long) (-1), "P0Y000DT00000.00110", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0989");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO(100L, (long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.899S" + "'", str2.equals("P-1Y11M30DT23H59M59.899S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0990");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (short) 0, "P-1Y11M30DT23H59M59.958S", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P-1Y11030DT23059059.9580" + "'", str3.equals("P-1Y11030DT23059059.9580"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0991");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) -1, "", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0992");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, (long) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2.equals("P0Y0M0DT0H0M0.000S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0993");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P-1Y11M30DT23H59M59.990S" + "'", str2.equals("P-1Y11M30DT23H59M59.990S"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0994");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.03211", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.03211" + "'", str3.equals("P0Y000DT00000.03211"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0995");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 1L, "P-1Y11M30DT23H59M59.990S", true, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0996");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 100, "0 seconds", false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0 0econ00" + "'", str3.equals("0 0econ00"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0997");
        java.lang.String str2 = org.apache.commons.lang3.time.DurationFormatUtils.formatDuration((long) 10, "P0000Y000DT00000.01010");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "P0000Y000DT00000.01010" + "'", str2.equals("P0000Y000DT00000.01010"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0998");
        java.util.TimeZone timeZone4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 10, "P0Y0M0DT0H0M0.011S", false, timeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test0999");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 1, "P0Y000DT00000.01035");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P0Y000DT00000.01035" + "'", str3.equals("P0Y000DT00000.01035"));
    }

    @Test
    public void DurationFormatUtils() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DurationFormatUtils1.test1000");
        java.lang.String str3 = org.apache.commons.lang3.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }
}

